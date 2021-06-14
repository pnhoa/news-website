package com.nhuhoa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nhuhoa.converter.NewConverter;
import com.nhuhoa.dto.NewDTO;
import com.nhuhoa.entity.NewEntity;
import com.nhuhoa.repository.NewRepository;
import com.nhuhoa.service.INewService;

@Service
public class NewService implements INewService{

	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private NewConverter newConverter;
	
	
	@Override
	public List<NewDTO> findAll(Pageable pageable) {
		//ModelMapper modelMapper = new ModelMapper();
		List<NewDTO> newDTOs = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		for(NewEntity item:entities) {
			NewDTO newModel = newConverter.toDto(item);
			//newModel = modelMapper.map(item, NewDTO.class);
			newDTOs.add(newModel);
		}
		return newDTOs;
		
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return (int)newRepository.count();
	}

	@Override
	public NewDTO findById(long id) {
		NewEntity entity = newRepository.findOne(id);
		return newConverter.toDto(entity);
	}

	


}
