package com.example.demo;

import java.text.ParseException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.TesteService;

@SpringBootApplication
public class MongoDbApplication {
	
	@Autowired
	TesteService testeService;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	@PostConstruct
	public void init() throws ParseException {


		System.out.println(testeService.count());
	}
}
