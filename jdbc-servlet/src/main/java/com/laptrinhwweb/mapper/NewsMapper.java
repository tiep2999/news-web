package com.laptrinhwweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhweb.model.News;

public class NewsMapper implements RowMapper<News> {

	@Override
	public News mapRow(ResultSet rs) {
		try {
			News news = new News();
			news.setId(rs.getLong("id"));
			news.setTitle(rs.getString("title"));
			news.setSummary(rs.getString("summary"));
			news.setCategoryId(rs.getLong("category_id"));
			news.setThumbnail(rs.getString("thumbnail"));
			news.setContent(rs.getString("content"));
			news.setCreatedDate(rs.getTimestamp("createddate"));
			news.setCreatedBy(rs.getString("createdby"));
			news.setModifiedDate(rs.getTimestamp("modifieddate"));
			news.setModifiedBy(rs.getString("modifiedby"));
			return news;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
