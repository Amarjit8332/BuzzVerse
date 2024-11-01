package com.buzzverse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buzzverse.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> findByFirstNameAndPhoneNumber(String firstName, String phoneNumber);
}
