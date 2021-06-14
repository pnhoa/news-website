package com.nhuhoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhuhoa.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
