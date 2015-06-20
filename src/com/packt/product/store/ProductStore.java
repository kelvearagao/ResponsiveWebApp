package com.packt.product.store;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.packt.product.obj.Product;

public class ProductStore {
	public	static	List<Product>	getAllListedBook()	{
		List<Product>	listProduct	=	new	ArrayList<Product>();
		
		Product	product2	=	new	Product();
		product2.setTitle("Buddy	press	theme	development");
		product2.setCost(12);
		product2.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product2.setUrl("asset/image/books/2.png");
		product2.setType("book");
		Product	product3	=	new	Product();
		product3.setTitle("Master	Web	Application	Development	with AngularJS");
		product3.setCost(14);
		product3.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product3.setUrl("asset/image/books/3.png");
		product3.setType("book");
		Product	product4	=	new	Product();
		product4.setTitle("Instant	GSON");
		product4.setCost(10);
		product4.setDescription("Lorem	ipsum	dollar.Lorem ipsum dollar.Lorem	ipsum	dollar.");
		product4.setUrl("asset/image/books/4.png");
		product4.setType("book");
		Product	product5	=	new	Product();
		product5.setTitle("jQuery Ui Cookbook");
		product5.setCost(17);
		product5.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product5.setUrl("asset/image/books/5.png");
		product5.setType("book");
		Product	product6	=	new	Product();
		product6.setTitle("Learning	IPython	For	Interactive	Computing	And	Data	Visualization");
		product6.setCost(13);
		product6.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product6.setUrl("asset/image/books/6.png");
		listProduct.add(product2);
		listProduct.add(product3);
		listProduct.add(product4);
		listProduct.add(product5);
		listProduct.add(product6);
		return	listProduct;
	}
	public	static	List<Product>	getAllListedVideo()	{
		List<Product>	listProduct	=	new	ArrayList<Product>();
		Product	product1	=	new	Product();
		product1.setTitle("Fast	Track	to	Adobe	Captivate	6");
		product1.setCost(12);
		product1.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product1.setUrl("asset/image/video/2.png");
		product1.setType("video");
		Product	product2	=	new	Product();
		product2.setTitle("Cassandra	Administration");
		product2.setCost(14);
		product2.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product2.setUrl("asset/image/video/3.png");
		product2.setType("video");
		Product	product3	=	new	Product();
		product3.setTitle("Play!	Framework	For	Web	Application	Development");
		product3.setCost(10);
		product3.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product3.setUrl("asset/image/video/4.png");
		product3.setType("video");
		Product	product4	=	new	Product();
		product4.setTitle("Getting	Started	With	magneto");
		product4.setCost(17);
		product4.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product4.setUrl("asset/image/video/5.png");
		product4.setType("video");
		Product	product5	=	new	Product();
		product5.setTitle("Building	a	Network	Application	With	Node");
		product5.setCost(13);
		product5.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product5.setUrl("asset/image/video/6.png");
		product5.setType("video");
		Product	product6	=	new	Product();
		product6.setTitle("Oracle	Apex	Technique");
		product6.setCost(13);
		product6.setDescription("Lorem	ipsum	dollar.Lorem	ipsum dollar.Lorem	ipsum	dollar.");
		product6.setUrl("asset/image/video/7.png");
		product6.setType("video");
		
		listProduct.add(product1);
		listProduct.add(product2);
		listProduct.add(product3);
		listProduct.add(product4);
		listProduct.add(product5);
		listProduct.add(product6);
		return	listProduct;
}
	public	static	String	cerateStaticJSON(List<Product>		listOfProduct)	{
		Gson	gson	=	new	GsonBuilder().setPrettyPrinting().create();
		String	json	=	gson.toJson(listOfProduct);
		return	json;
	}
}
