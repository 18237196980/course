package com.course.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.course.system.mapper")
public class SystemApplication {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(SystemApplication.class);
        // SpringApplication.run(EurekaApplication.class,args);

        Environment env = SpringApplication.run(SystemApplication.class, args)
                                           .getEnvironment();
        String property = env.getProperty("server.port");
        try {
            log.info("SystemApplication启动成功");
            log.info("http://127.0.0.1:{}", property);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
