package util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Servlet Filter implementation class HibernateSessionFilter
 */
@WebFilter(servletNames={"Faces Servlet"})
//@WebFilter("/index.html")
public class HibernateSessionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HibernateSessionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Kelve --> Iniciando filtro!");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			request.setAttribute("session", session);
			
			// pass the request along the filter chain
			chain.doFilter(request, response);
			
			transaction.commit();
		} catch (Exception e) {
			if( transaction != null )
				transaction.rollback();
		} finally {
			session.close();
			System.out.println("Kelve --> Finalizando filtro!");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
