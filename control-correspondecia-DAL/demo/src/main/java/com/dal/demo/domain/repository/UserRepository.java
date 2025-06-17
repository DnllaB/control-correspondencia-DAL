package com.dal.demo.domain.repository;

import com.dal.demo.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Integer>{
    Optional<User> findUserByEmail(String email);
    Page<User> findAll(Pageable pageable);

}


