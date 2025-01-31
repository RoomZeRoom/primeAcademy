package com.example.demo.repository;

import com.example.demo.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByActiveIsTrue();

    Optional<User> findUserByUsernameAndActiveIsTrue(String username);

    Optional<User> findByIdAndActiveIsTrue(Long id);
}
