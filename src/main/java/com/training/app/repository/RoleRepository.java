package com.training.app.repository;

import com.training.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long>{

    public Set<Role> findByNameContaining(String roleName);
}
