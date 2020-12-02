package com.geektime.springbootdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * @author Administrator
 * @since 2020/12/2 11:00
 * 这里，我们配置了4个数据源，1个master，2两个slave，1个路由数据源。
 * 前3个数据源都是为了生成第4个数据源，而且后续我们只用这最后一个路由数据源myRoutingDataSource。
 */
@EnableTransactionManagement
@Configuration
public class MyBatisConfig {
    @Resource(name = "myRoutingDataSource")
    private DataSource myRoutingDataSource;

    /**
     * 扫描mybatis下的xml文件
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(myRoutingDataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapping/shop/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(myRoutingDataSource);//由于Spring容器中现在有4个数据源，所以我们需要为事务管理器和MyBatis手动指定一个明确的数据源。
    }
}
