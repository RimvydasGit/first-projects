package lt.codeacademy.thymeleaf;

import lt.codeacademy.thymeleaf.entities.User;
import lt.codeacademy.thymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;


//https://www.baeldung.com/spring-boot-crud-thymeleaf
@SpringBootApplication
public class Thymeleaf36Application {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf36Application.class, args);
	}

	}

		@Configuration
		public class Additions {
			@Autowired
			UserRepository userRepository;
			@EventListener
			public void seed(ContextRefreshedEvent event) {
			System.out.println("Server started");
				userRepository.save(new User("Berzas", "Zalias", "1578"));
				userRepository.save(new User("Klevas", "Raudonas", "2233"));
				userRepository.save(new User("Liepa", "Pilka", "5578"));
			}
		}
	}
