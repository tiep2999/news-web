package com.laptrinhweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhweb.dao.ICategoryDAO;
import com.laptrinhweb.model.Category;
import com.laptrinhweb.service.ICategoryService;

public class CategoryService implements ICategoryService{
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<Category> findAll() {		
		return categoryDao.findAll();
	}
	
}
