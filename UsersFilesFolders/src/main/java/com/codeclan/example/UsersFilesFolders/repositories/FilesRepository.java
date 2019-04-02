package com.codeclan.example.UsersFilesFolders.repositories;


import com.codeclan.example.UsersFilesFolders.models.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<Files, Long> {
}
