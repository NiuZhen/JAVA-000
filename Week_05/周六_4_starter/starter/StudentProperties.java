package io.niuz.springboot.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "niut")
@Data
class StudentProperties {
    private Integer id;
    private String name;
}
