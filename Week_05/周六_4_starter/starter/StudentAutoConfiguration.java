package io.niuz.springboot.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties(StudentProperties.class)
@ConditionalOnProperty(prefix = "niut", name = "enabled", havingValue = "true",matchIfMissing = true)
@PropertySource("classpath:/META-INF/application.properties")
public class StudentAutoConfiguration {

    @Autowired
    private StudentProperties studentProperties;

    @Bean(name = "niut")
    public StudentService studentService(){
        return new StudentService(studentProperties.getId(),studentProperties.getName());
    }


}
