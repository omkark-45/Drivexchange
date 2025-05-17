package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Role;

public interface RoleRepo extends JpaRepository<Role, Long>
{
	Role findByRoleName(String roleName);
}

