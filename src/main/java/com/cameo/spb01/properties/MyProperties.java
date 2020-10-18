package com.cameo.spb01.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "cameo")
@Component
@Data
public class MyProperties {
    private String id;
    private String name;

}
