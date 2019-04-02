package com.codeclan.example.UsersFilesFolders.repositories;

import com.codeclan.example.UsersFilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
