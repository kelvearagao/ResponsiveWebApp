package stock.repository;

import java.util.List;

import stock.model.Client;

public interface ClientRepository {
	public List<Client> all();
	public void add(Client client);
	public Client byId(long id);
	public void delete(Client client);
	public void update(Client client);
}
