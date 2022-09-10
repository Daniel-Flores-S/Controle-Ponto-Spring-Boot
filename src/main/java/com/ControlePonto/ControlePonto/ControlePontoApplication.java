package com.ControlePonto.ControlePonto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching
@EnableAsync
public class ControlePontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlePontoApplication.class, args);
	}

}
