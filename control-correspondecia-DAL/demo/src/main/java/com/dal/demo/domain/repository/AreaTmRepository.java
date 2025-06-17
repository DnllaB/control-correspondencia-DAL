package com.dal.demo.domain.repository;

import com.dal.demo.domain.entity.AreaTm;
import com.dal.demo.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AreaTmRepository extends JpaRepository <AreaTm,Integer> {
    Optional<AreaTm> findUserByEmail(String email);
    Page<AreaTm> findAll(Pageable pageable);
}
