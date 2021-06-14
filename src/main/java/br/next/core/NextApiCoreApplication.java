package br.next.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@Configuration
public class NextApiCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextApiCoreApplication.class, args);
	}
	
	
	@Bean
	public ExecutorService executor() {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		log.info("Iniciando pool de threads fixado para {} processors",availableProcessors);
		return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

}
