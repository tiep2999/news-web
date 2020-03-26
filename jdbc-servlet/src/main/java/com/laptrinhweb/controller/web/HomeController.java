package com.laptrinhweb.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 7753963690669418503L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String title = "bai viet 5";
//		String content = "lolololol";
//		Long categoryId = 1L;
//		News news = new News();
//		Long id = 5L;
//		news.setId(id);
//		newsService.delete(news);
//		news.setCategoryId(categoryId);
//		news.setTitle(title);
//		news.setContent(content);
//		newsService.save(news);
//		Long category_id = 1L;
//		request.setAttribute("news", newsService.findByCategoryId(category_id));
//		request.setAttribute("category", categoryService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
