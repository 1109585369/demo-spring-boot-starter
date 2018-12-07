package com.example.demospringbootstarter.configuraction;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yy
 * @ProjectName demo-spring-boot-starter
 * @Description: TODO
 * @date 2018/12/7 17:45
 */

@ConfigurationProperties("example.service")
public class StarterServiceProperties {

    private String config;


    public StarterServiceProperties(String config) {
        this.config = config;
    }

    public String getConfig(){
        return config;
    }
}
