package com.laptrinhjava.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.constant.Constant;
import com.laptrinhweb.model.News;
import com.laptrinhweb.service.impl.NewsService;

@WebServlet(urlPatterns = {"/admin-news-list"})
public class NewsController extends HttpServlet {
	
	@Inject
	private NewsService newsService;
	
	private static final long serialVersionUID = -7330249240612768305L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		News news = new News();
		news.setLimitItem(4);
		news.setListModel(newsService.findAll());
		news.setTotalItem(newsService.findAll().size());
		int totalPage = (int)Math.ceil(news.getTotalItem() / news.getLimitItem());
		news.setTotalPage(totalPage);
		request.setAttribute(Constant.MODEL, news);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/news/list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
