package com.example.demospringbootstarter.service;

import org.springframework.util.StringUtils;

/**
 * @author yy
 * @ProjectName demo-spring-boot-starter
 * @Description: TODO
 * @date 2018/12/7 17:42
 */
public class StarterService {

    private String config;


    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar){
        return StringUtils.split(this.config,separatorChar);
    }
}
