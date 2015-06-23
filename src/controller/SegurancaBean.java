package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
public class SegurancaBean {
	private String name;
	private String senha;
	
	public String logar() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();

		try {
			//request.logout();
			request.login(this.name, this.senha);
			return "index.xhtml?faces-redirect=true";
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "erro.xhtml";
			//return null;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
