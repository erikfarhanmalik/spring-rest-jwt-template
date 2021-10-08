package com.erik.rest.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class PropertiesLoader {
}
