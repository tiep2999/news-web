package com.laptrinhweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhweb.dao.INewsDao;
import com.laptrinhweb.model.News;
import com.laptrinhweb.service.INewsService;

public class NewsService implements INewsService {

	@Inject
	private INewsDao newsDao;

	@Override
	public List<News> findByCategoryId(Long category_id) {
		return newsDao.findByCategoryId(category_id);
	}

	@Override
	public News save(News news) {
		news.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		news.setCreatedBy("");
		Long newsId = newsDao.save(news);
		return newsDao.findOne(newsId);
	}

	@Override
	public void delete(long[] ids) {
		for (long id : ids) {
			newsDao.delete(id);
		}
	}

	@Override
	public News update(News updateNews) {
		News oldNews = newsDao.findOne(updateNews.getId());
		updateNews.setCreatedDate(oldNews.getCreatedDate());
		updateNews.setCreatedBy(oldNews.getCreatedBy());
		updateNews.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNews.setModifiedBy("");
		newsDao.update(updateNews);
		return newsDao.findOne(updateNews.getId());
	}

	@Override
	public List<News> findAll() {
		return newsDao.FindAll();
	}
}
