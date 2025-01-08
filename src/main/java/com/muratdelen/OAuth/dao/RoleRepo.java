package com.muratdelen.OAuth.dao;

import com.muratdelen.OAuth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findById(long id);
    Role findByName(String name);
}
