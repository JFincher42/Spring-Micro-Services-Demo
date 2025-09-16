package com.dcm.mgmt_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MgmtMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgmtMicroserviceApplication.class, args);
	}

}
