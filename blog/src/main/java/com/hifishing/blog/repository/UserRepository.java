package com.hifishing.blog.repository;

import com.hifishing.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);

    Optional<User> findOneByUsername(String username);
}
