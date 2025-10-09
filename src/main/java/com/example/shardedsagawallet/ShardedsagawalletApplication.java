package com.example.shardedsagawallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShardedsagawalletApplication {

	public static void main(String[] args) {

		int x=10;

		System.out.println("start");
		SpringApplication.run(ShardedsagawalletApplication.class, args);
		System.out.println("end");
	}

}
