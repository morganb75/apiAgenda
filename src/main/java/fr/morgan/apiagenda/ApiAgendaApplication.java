package fr.morgan.apiagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ApiAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAgendaApplication.class, args);
	}

}
