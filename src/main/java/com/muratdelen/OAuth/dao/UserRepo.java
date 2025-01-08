package com.muratdelen.OAuth.dao;

import com.muratdelen.OAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findById(long id);
    User findByEmail(String email);
    User findByUsername(String username);
}
