package com.iboy.first.repo;

import com.iboy.first.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findUserById(Long id);

    void deleteUserById(Long id);

    List<User> findAllByOrderById();
}
