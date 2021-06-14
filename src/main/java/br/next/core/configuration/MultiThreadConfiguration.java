package br.next.core.configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MultiThreadConfiguration {
	
	@Bean
	public ExecutorService executor() {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		log.info("Iniciando pool de threads fixado para {} processors",availableProcessors);
		return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
}
