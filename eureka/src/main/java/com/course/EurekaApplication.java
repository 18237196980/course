package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(EurekaApplication.class);
        // SpringApplication.run(EurekaApplication.class,args);

        Environment env = SpringApplication.run(EurekaApplication.class, args)
                                           .getEnvironment();
        String property = env.getProperty("server.port");
        try {
            log.info("eureka启动成功");
            log.info("eureka注册中心 http://127.0.0.1:{}", property);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
