package org.wcd.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class BlogServlet
 */
@WebServlet("/blog/*")
public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BlogServlet() {
        super();
    }

}
