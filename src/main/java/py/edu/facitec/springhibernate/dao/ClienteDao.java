package py.edu.facitec.springhibernate.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springhibernate.model.Cliente;

@Repository // Gestion de datos
public class ClienteDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Cliente cliente){
		manager.persist(cliente);
		
	}
	

}
