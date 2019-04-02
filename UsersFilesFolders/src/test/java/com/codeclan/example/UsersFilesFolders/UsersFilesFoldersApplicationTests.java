package com.codeclan.example.UsersFilesFolders;

import com.codeclan.example.UsersFilesFolders.models.User;
import com.codeclan.example.UsersFilesFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFilesFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void CreateUser() {
		User user = new User("Winston");
		userRepository.save(user);
	}
}
