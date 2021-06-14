package br.next.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class NextApiCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextApiCoreApplication.class, args);
	}
	
}
