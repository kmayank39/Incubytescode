package com.incubyte.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MainController() {
        super();
    }

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//String url = req.getRequestURL().toString();
		//System.out.println(url);
		
		String[] url = req.getRequestURI().toString().split("/");
		//System.out.println(url[url.length - 1]);
		String result = url[url.length - 1];
				
		PrintWriter pw = resp.getWriter();
		pw.print("Hello, "+result);
		
	}
}
