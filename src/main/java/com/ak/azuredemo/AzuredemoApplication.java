package com.ak.azuredemo;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzuredemoApplication {

	public static void main(String[] args) {
		// enable Application Insights Java programmatically, see
		// https://learn.microsoft.com/en-us/azure/azure-monitor/app/java-spring-boot#enabling-programmatically
		https://github.com/Azure-Samples/spring-petclinic-java-mysql/tree/ec32fb0dc39b2c0c7026e8733a4df2a7784e6382

		ApplicationInsights.attach();

		SpringApplication.run(AzuredemoApplication.class, args);
	}

}