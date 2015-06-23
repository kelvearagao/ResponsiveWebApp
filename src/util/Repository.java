package util;

import org.hibernate.Session;

import dao.ProductHibernate;
import repository.ProductRepository;
import stock.dao.ClientHibernate;
import stock.repository.ClientRepository;

public class Repository {
	public ProductRepository getProductRepository() {
		return new ProductHibernate(this.getSession());
	}
	
	public ClientRepository getClientRepository() {
		return new ClientHibernate(this.getSession());
	}
	
	private Session getSession() {
		return (Session) FacesUtil.getRequestAttribute("session");
	}
}
 