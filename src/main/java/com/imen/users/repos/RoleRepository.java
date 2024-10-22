package com.imen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imen.users.entitis.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}
