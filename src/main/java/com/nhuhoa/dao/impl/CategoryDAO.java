package com.nhuhoa.dao.impl;

import java.util.List;

import com.nhuhoa.dao.ICategoryDAO;
import com.nhuhoa.mapper.CategoryMapper;
import com.nhuhoa.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{
	
	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * from category WHERE id = ?";
		List<CategoryModel> categorys = query(sql, new CategoryMapper(), id);
		return categorys.isEmpty() ? null : categorys.get(0);
	}

	@Override
	public CategoryModel findOneByCode(String code) {
		String sql = "SELECT * from category WHERE code = ?";
		List<CategoryModel> categorys = query(sql, new CategoryMapper(), code);
		return categorys.isEmpty() ? null : categorys.get(0);
	}
}
