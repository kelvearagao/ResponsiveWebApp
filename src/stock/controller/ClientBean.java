package stock.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.hibernate.sql.Update;

import stock.model.Client;
import stock.repository.ClientRepository;
import util.Repository;

@ManagedBean
public class ClientBean {
	private Repository repository = new Repository();
	private Client client = new Client();;
	private ClientRepository clientRepository;
	private List<Client> clients;
	private boolean update = false;
	
	@PostConstruct
	public void init() {
		clientRepository = repository.getClientRepository();
	}

	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void add() {
		clientRepository.add(client);
		client = new Client();
	}
	
	public void delete() {
		clientRepository.delete(this.client);
		client = new Client();
	}
	
	public String edit() {
		update = true;
		
		return null;
	}
	
	public void update() {
		clientRepository.update(this.client);
		update = false;
		client = new Client();
	}

	public List<Client> getClients() {
		clients = clientRepository.all();
		
		return clients;
	}
	
	public boolean getUpdate() {
		return this.update;
	}
}
