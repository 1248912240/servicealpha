package com.tony;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author fut
 * @Date 2018-11-26
 * @Description
 * @Wiki:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TonyApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TonyApplication.class).web(true).run(args);
    }
}
