package repository;

import java.util.List;

import model.Product;

public interface ProductRepository {
	public List<Product> all();
	public void add(Product product);
	public Product byId(long id);
}
