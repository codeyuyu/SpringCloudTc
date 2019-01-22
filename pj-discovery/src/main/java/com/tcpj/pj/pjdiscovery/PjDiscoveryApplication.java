package com.tcpj.pj.pjdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PjDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PjDiscoveryApplication.class, args);
    }

}

