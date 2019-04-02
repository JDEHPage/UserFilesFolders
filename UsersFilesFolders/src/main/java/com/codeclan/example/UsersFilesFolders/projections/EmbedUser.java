package com.codeclan.example.UsersFilesFolders.projections;

import com.codeclan.example.UsersFilesFolders.models.Files;
import com.codeclan.example.UsersFilesFolders.models.Folder;
import com.codeclan.example.UsersFilesFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    Files getFiles();
    User getUser();
}
