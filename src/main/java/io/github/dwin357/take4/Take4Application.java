package io.github.dwin357.take4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Take4Application {

	public static void main(String[] args) {
		SpringApplication.run(Take4Application.class, args);
	}
}
