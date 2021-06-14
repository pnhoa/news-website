package com.nhuhoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhuhoa.entity.NewEntity;

//tham so thu nhat loai Entity, tham so thu hai kieu dl cua khoa chinh trong Entity
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
 