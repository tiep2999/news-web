package com.laptrinhweb.dao.impl;

import java.util.List;

import com.laptrinhweb.dao.ICategoryDAO;
import com.laptrinhweb.model.Category;
import com.laptrinhwweb.mapper.CategoryMapper;

public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO {

	@Override
	public List<Category> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
}
