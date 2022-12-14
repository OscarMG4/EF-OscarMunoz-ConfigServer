package com.idat.pe.ef.OscarMunoz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfOscarMunozConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfOscarMunozConfigServerApplication.class, args);
	}

}
