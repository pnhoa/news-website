package com.nhuhoa.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.nhuhoa.dto.NewDTO;

public interface INewService {
	
	List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
	NewDTO findById(long id);
	
}

