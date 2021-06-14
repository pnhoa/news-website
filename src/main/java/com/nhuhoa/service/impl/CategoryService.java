package com.nhuhoa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuhoa.converter.CategoryConverter;
import com.nhuhoa.dto.CategoryDTO;
import com.nhuhoa.entity.CategoryEntity;
import com.nhuhoa.repository.CategoryRepository;
import com.nhuhoa.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryConverter categoryConverter;
	
	@Override
	public Map<String, String> findAll() {
		Map<String, String> result = new HashMap<String, String>();
		List<CategoryEntity> entities = categoryRepository.findAll();
		for(CategoryEntity item: entities) {
			result.put(item.getCode(),item.getName());
		}
		return result;
	}

}
