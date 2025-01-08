package com.muratdelen.OAuth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRole extends JpaRepository<UserRole, Integer> {
    UserRole findById(long id);
    UserRole findByName(String name);
    UserRole findByRole(String role);
}
