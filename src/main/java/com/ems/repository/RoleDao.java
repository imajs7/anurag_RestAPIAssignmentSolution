package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer>{

}
