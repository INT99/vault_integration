package com.example.vault_integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class VaultIntegrationApplication implements CommandLineRunner {
	@Value("${application.cbs.username}")
	private String username;

	@Value("${application.cbs.password}")
	private String password;

	@Autowired
	private Credential credential;
	public static void main(String[] args) {
		SpringApplication.run(VaultIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("--------------Properties ----------------");
		log.info("Credential Username: {}", username);
		log.info("Credential Password: {}", password);
	}
}
