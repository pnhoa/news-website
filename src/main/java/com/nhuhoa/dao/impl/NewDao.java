package com.nhuhoa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nhuhoa.dao.INewDAO;
import com.nhuhoa.mapper.NewMapper;
import com.nhuhoa.model.NewModel;

@Repository
public class NewDao extends AbstractDAO<NewModel> implements INewDAO  {

	@Override
	public List<NewModel> findAll() {
		//String sql = "SELECT * from news LIMIT ?,?";
		StringBuilder sql = new StringBuilder("SELECT * from news");
		
		return query(sql.toString(), new NewMapper());
	}

	

}
