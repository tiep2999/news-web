package com.laptrinhweb.dao;

import java.util.List;

import com.laptrinhweb.model.News;

public interface INewsDao extends GenericDAO<News> {
	List<News> findByCategoryId(Long category_id);
	Long save(News news);
	News findOne(Long id);
	void update(News news);
	void delete(long id);
}
