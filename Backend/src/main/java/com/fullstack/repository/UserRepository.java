package com.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
