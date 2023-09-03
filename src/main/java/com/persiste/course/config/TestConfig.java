package com.persiste.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.persiste.course.entities.User;
import com.persiste.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Johoson","maria@yahoo.com","95544-1122","856440");
		User u2 = new User(null,"Gray Johoson","gray.com","99994-8888","516487");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
