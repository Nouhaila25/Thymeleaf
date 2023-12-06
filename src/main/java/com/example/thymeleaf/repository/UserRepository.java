package com.example.thymeleaf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.thymeleaf.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
