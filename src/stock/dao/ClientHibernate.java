package stock.dao;

import java.util.List;

import org.hibernate.Session;

import stock.model.Client;
import stock.repository.ClientRepository;

public class ClientHibernate implements ClientRepository{
	private Session session;
	
	public ClientHibernate(Session session) {
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> all() {
		return session.createCriteria(Client.class).list();
	}

	@Override
	public void add(Client client) {
		session.save(client);
	}

	@Override
	public Client byId(long id) {
		return (Client) session.get(Client.class, id);
	}

	@Override
	public void delete(Client client) {
		session.delete(client);
	}

	@Override
	public void update(Client client) {
		Client clientUp = byId(client.getId());
		clientUp.setName(client.getName());
		clientUp.setBirthdate(client.getBirthdate());
		
		session.update(clientUp);
	}
}
