package com.laptrinhjava.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhweb.model.News;
import com.laptrinhweb.service.INewsService;
import com.laptrinhweb.utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-admin-news" })
public class NewsAPI extends HttpServlet {
	@Inject
	private INewsService newsService;

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		News news = HttpUtil.of(request.getReader()).toModel(News.class);
		news = newsService.save(news);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(response.getOutputStream(), news);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("aplication/json");
		News news = HttpUtil.of(request.getReader()).toModel(News.class);
		news = newsService.update(news);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(response.getOutputStream(), news);
		
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		News news = HttpUtil.of(request.getReader()).toModel(News.class);
		newsService.delete(news.getIds());
		ObjectMapper mapper = new ObjectMapper();	
		mapper.writeValue(response.getOutputStream(), "{}");
	}

}
