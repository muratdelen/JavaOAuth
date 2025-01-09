package com.muratdelen.OAuth.dao;

import com.muratdelen.OAuth.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long> {
    public UserRole findById(long id);

}
