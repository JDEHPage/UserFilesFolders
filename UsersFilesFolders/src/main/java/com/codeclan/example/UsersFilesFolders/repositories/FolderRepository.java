package com.codeclan.example.UsersFilesFolders.repositories;

import com.codeclan.example.UsersFilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
