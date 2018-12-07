package com.example.demospringbootstarter.autoConfigure;

import com.example.demospringbootstarter.configuraction.StarterServiceProperties;
import com.example.demospringbootstarter.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yy
 * @ProjectName demo-spring-boot-starter
 * @Description: TODO
 * @date 2018/12/7 17:49
 */

@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired(required = false)
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service",value = "enable",havingValue = "true")
    StarterService starterService(){
        return new StarterService(properties.getConfig());
    }

}
