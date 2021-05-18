package com.course.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(GatewayApplication.class);
        // SpringApplication.run(EurekaApplication.class,args);

        Environment env = SpringApplication.run(GatewayApplication.class, args)
                                           .getEnvironment();
        String property = env.getProperty("server.port");
        try {
            log.info("GatewayApplication启动成功");
            log.info("http://127.0.0.1:{}", property);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
