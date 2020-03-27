package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.model.News;

public interface INewsService {
	List<News> findByCategoryId(Long categoy_id);
	News save(News news);
	void delete(long[] ids); 
	News update(News news);
	List<News> findAll();
}
