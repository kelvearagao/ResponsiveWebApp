package stock.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import stock.model.Client;
import stock.repository.ClientRepository;
import util.Repository;

@FacesConverter(forClass=Client.class)
public class ClientConverter implements Converter{
	private Repository repository = new Repository();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Client client = null;
		
		if(value != null)
		{
			ClientRepository clientRepository = repository.getClientRepository(); 
			client = clientRepository.byId(new Long(value));
		}
		
		return client;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object obj) {
		if(obj != null) {
			return new Long(((Client) obj).getId()).toString();
		}
		
		return null;
	}
}
