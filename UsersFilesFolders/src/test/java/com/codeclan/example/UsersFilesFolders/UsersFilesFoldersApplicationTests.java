package com.codeclan.example.UsersFilesFolders;

import com.codeclan.example.UsersFilesFolders.models.Folder;
import com.codeclan.example.UsersFilesFolders.models.User;
import com.codeclan.example.UsersFilesFolders.repositories.FolderRepository;
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

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void CreateUserAndFolder() {
		User user = new User("Winston");
		userRepository.save(user);
		Folder folder = new Folder("Important Stuff", user);
		folderRepository.save(folder);
	}
}
