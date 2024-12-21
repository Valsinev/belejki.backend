package com.belejki.backend;

import com.belejki.backend.dao.UserDAO;
import com.belejki.backend.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner commmandLineRunner (UserDAO userDAO){

		return runner -> {
			createUser(userDAO);
			//findUser(userDAO, 2);
			//userDAO.removeById(1);
			userDAO.findAll().forEach(System.out::println);

		};
	}

	private void findUser(UserDAO userDAO, long id) {
		User findedUser = userDAO.findById(id);
		System.out.println(findedUser);
	}


	private void createUser(UserDAO userDAO) {
		User testUser = new User("test@email.com", true,
				"Pesho", false, LocalDate.now(),
				"Peshev", "1234!", 1, LocalDate.now());

		userDAO.save(testUser);
		System.out.println(testUser.getId());
	}

}
