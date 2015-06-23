package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

import dao.ProductHibernate;
import repository.ProductRepository;
import util.Repository;
import model.Product;

@ManagedBean
@RequestScoped
public class ProductBean {
	private Repository repository = new Repository();
	ProductRepository productRepository;
	private Product product = new Product();
	
	@PostConstruct
	public void init() {
		productRepository = repository.getProductRepository();
	}

	public Product getProduct() {
		return product;
	}
	
	public void add() {
		this.productRepository.add(this.product);	
		this.product = new Product();
	}
}
