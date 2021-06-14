package com.nhuhoa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nhuhoa.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<String>();
		menus.add("Blog Java");
		menus.add("Hướng dẫn học tập Java");
		menus.add("Liên hệ");
		menus.add("Thanh toán");
		return menus;
	}

}
