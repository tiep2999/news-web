package com.laptrinhweb.dao.impl;

import java.util.List;

import com.laptrinhweb.dao.INewsDao;
import com.laptrinhweb.model.News;
import com.laptrinhwweb.mapper.NewsMapper;

public class NewsDao extends AbstractDAO<News> implements INewsDao {

	@Override
	public List<News> findByCategoryId(Long Category_id) {
		String sql = "SELECT * FROM news WHERE category_id = ?;";
		return query(sql, new NewsMapper(), Category_id);
	}

	@Override
	public Long save(News news) {
		String sql = "INSERT INTO news(title, content, category_id, thumbnail, summary, createddate, createdby) values (?, ?, ?, ?, ?, ?, ?)";
		return insert(sql, news.getTitle(), news.getContent(), news.getCategoryId(), news.getThumbnail(), news.getSummary(), news.getCreatedDate(), news.getCreatedBy());
	}

	@Override
	public News findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?;";
		List<News> news = query(sql, new NewsMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(News news) {
		String sql = "UPDATE news SET title = ?, category_id = ?, summary = ?, content = ?, thumbnail = ?, createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?";
		update(sql, news.getTitle(), news.getCategoryId(), news.getSummary(), news.getContent(), news.getThumbnail(), news.getCreatedDate(), news.getCreatedBy(), news.getModifiedDate(), news.getModifiedBy(), news.getId());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM news WHERE id =?";
		update(sql, id);
	}

	@Override
	public List<News> FindAll() {
		String sql = "SELECT * FROM news";
		return query(sql, new NewsMapper());
	}
	
	
	
	
}
