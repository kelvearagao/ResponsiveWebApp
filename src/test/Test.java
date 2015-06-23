package test;

import org.hibernate.Session;

import util.HibernateUtil;
import model.Pessoa;

public class Test {
	
	public static void main(String args[]) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(343545);
		pessoa.setNome("Kelve");
		session.save(pessoa);

		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
}
	