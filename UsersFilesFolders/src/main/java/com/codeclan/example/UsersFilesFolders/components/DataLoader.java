package com.codeclan.example.UsersFilesFolders.components;

import com.codeclan.example.UsersFilesFolders.models.Files;
import com.codeclan.example.UsersFilesFolders.models.Folder;
import com.codeclan.example.UsersFilesFolders.models.User;
import com.codeclan.example.UsersFilesFolders.repositories.FilesRepository;
import com.codeclan.example.UsersFilesFolders.repositories.FolderRepository;
import com.codeclan.example.UsersFilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FilesRepository filesRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User mike = new User("Mike");
        userRepository.save(mike);

        Folder folder1 = new Folder("Secret", mike);
        folderRepository.save(folder1);

        Files files13 = new Files("DooOOMMmm",".jpg",23, folder1);
        filesRepository.save(files13);

        mike.addFolders(folder1);
        userRepository.save(mike);
        folder1.addFiles(files13);
        folderRepository.save(folder1);
    }
}
