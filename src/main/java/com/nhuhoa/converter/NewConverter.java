package com.nhuhoa.converter;

import org.springframework.stereotype.Component;

import com.nhuhoa.dto.NewDTO;
import com.nhuhoa.entity.NewEntity;

@Component
public class NewConverter {
	
	public NewDTO toDto(NewEntity entity) {
		NewDTO result = new NewDTO();
		result.setTitle(entity.getTitle());
		result.setShortDescription(entity.getShortDescription());
		result.setContent(entity.getContent());
		result.setThumbnail(entity.getThumbnail());
		result.setCategoryCode(entity.getCategory().getCode());
		return result;
	}
	
	public NewEntity toEntity(NewDTO dto) {
		NewEntity result = new NewEntity();
		result.setTitle(dto.getTitle());
		result.setShortDescription(dto.getShortDescription());
		result.setContent(dto.getContent());
		result.setThumbnail(dto.getThumbnail());
		return result;
	}
}
