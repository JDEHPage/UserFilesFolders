package com.codeclan.example.UsersFilesFolders.repositories;

import com.codeclan.example.UsersFilesFolders.models.Folder;
import com.codeclan.example.UsersFilesFolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
