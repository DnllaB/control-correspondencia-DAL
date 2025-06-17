package com.dal.demo.domain.repository;

import com.dal.demo.domain.entity.AreaCategoryRqst;
import com.dal.demo.domain.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AreaCategoryRqstRepository extends JpaRepository<AreaCategoryRqst, Integer> {

    Optional<AreaCategoryRqst> findUserByEmail(String email);
    Page<AreaCategoryRqst> findAll(Pageable pageable);
}
