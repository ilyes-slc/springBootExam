package tn.esprit.examenspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ExamenSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSpringBootApplication.class, args);
	}

}
