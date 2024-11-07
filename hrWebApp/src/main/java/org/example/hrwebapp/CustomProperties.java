package org.example.hrwebapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "org.example.hrwebapp")
@Data
public class CustomProperties {
    private String apiUrl;
}
