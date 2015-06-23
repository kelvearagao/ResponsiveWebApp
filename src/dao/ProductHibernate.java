package dao;

import java.util.List;

import org.hibernate.Session;

import model.Product;
import repository.ProductRepository;

public class ProductHibernate implements ProductRepository{
	private Session session;
	
	public ProductHibernate(Session session) {
		// TODO Auto-generated constructor stub
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> all() {
		// TODO Auto-generated method stub
		return session.createCriteria(Product.class).list();
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		session.save(product);
	}

	@Override
	public Product byId(long id) {
		// TODO Auto-generated method stub
		return (Product) session.get(Product.class, id);
	}
	
}
