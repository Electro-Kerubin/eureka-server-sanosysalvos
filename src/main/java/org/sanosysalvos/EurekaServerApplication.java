package org.sanosysalvos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void EurekaServerApplication(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
