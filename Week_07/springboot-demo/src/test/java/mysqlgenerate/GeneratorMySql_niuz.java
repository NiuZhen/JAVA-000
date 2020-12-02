package mysqlgenerate;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis generator逆向工程  (开发人员用滴, 用于生成PO实体类、 Mapper接口、XMLMapper映射文件)
 * ！！！生成的内容禁止手动修改！！！
 */
public class GeneratorMySql_niuz {
    public static void generateMySql( String ide_name ) throws Exception {
        if("eclipse".equalsIgnoreCase(ide_name)) {
            /** eclipse IDE 执行代码 start*/
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(GeneratorMySql_niuz.class.getClassLoader().getResourceAsStream(generatorConfigFile) );
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            /** eclipse IDE 执行代码 end*/
            System.out.println("eclipse-------------------GeneratorMySql OK : "+ generatorConfigFile );
        }
        if("InteliJ".equalsIgnoreCase(ide_name)) {
            /** InteliJ IDE 执行代码 start*/
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            File configFile = new File("D:\\java\\openSource\\niu-test\\springboot-demo\\src\\test\\java\\"+generatorConfigFile);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            /** InteliJ IDE 执行代码 end*/
            System.out.println("InteliJ-------------------GeneratorMySql OK : "+ generatorConfigFile );
        }
    }

    //------------------------------------------------------------------------请开发人员根据各自IDE工具调整如下代码!!!!!!!!!!!!!!!
    //指定 mybatis generator逆向工程配置文件
    private static final String generatorConfigFile = "generatorConfig-niuz.xml";
    public static void main(String[] args) throws Exception{
        GeneratorMySql_niuz.generateMySql("InteliJ");  //InteliJ IDE 执行代码
//		GeneratorMySql.generateMySql("eclipse");//eclipse IDE 执行代码
    }
}
