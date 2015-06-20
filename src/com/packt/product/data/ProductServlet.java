package com.packt.product.data;

import	java.io.IOException;
import	java.io.PrintWriter;
import	java.util.List;
import	javax.servlet.ServletException;
import	javax.servlet.annotation.WebServlet;
import	javax.servlet.http.HttpServlet;
import	javax.servlet.http.HttpServletRequest;
import	javax.servlet.http.HttpServletResponse;
import	com.packt.product.obj.Product;
import	com.packt.product.store.ProductStore;
@WebServlet("/ProductServlet")
public	class	ProductServlet	extends	HttpServlet	{
	private	static	final	long	serialVersionUID	=	1L;
	public	ProductServlet()	{
					super();
	}
	
	protected	void	doGet(HttpServletRequest request,	HttpServletResponse response)	throws	ServletException,	IOException	{									
		String	type	=	request.getParameter("type");
		List<Product>		listOfProduct	=	null;
							
		if("book".equalsIgnoreCase(type)){
			listOfProduct	=	ProductStore.getAllListedBook();
		}else if("video".equalsIgnoreCase(type)){
			listOfProduct	=	ProductStore.getAllListedVideo();
		}
		
		String	productJsonString	=	ProductStore.cerateStaticJSON(listOfProduct);
		
		response.setContentType("application/json");
		
		PrintWriter	out	=	response.getWriter();
			out.write(productJsonString);
	}
}