package com.nhuhoa.dao;

import java.util.List;

import com.nhuhoa.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	
	List<NewModel> findAll();
	
}
