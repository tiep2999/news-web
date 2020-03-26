package com.laptrinhweb.dao;

import java.util.List;

import com.laptrinhweb.model.Category;

public interface ICategoryDAO extends GenericDAO<Category> {
	List<Category> findAll();
}
