package com.imen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imen.users.entitis.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}