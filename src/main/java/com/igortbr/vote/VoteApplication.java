package com.igortbr.vote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class VoteApplication {

	public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load(); 
		SpringApplication.run(VoteApplication.class, args);
	}

}
