package py.edu.facitecspringhibernate.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.springhibernate.model.Cliente;



@Transactional
@Controller
public class ClienteController {
	
	@Autowired
	
	private py.edu.facitec.springhibernate.dao.ClienteDao ClienteDao;
	
	@RequestMapping("/clientes")//inyecta los datos dentro del objeto
	public String save(Cliente cliente){
		
		ClienteDao.save(cliente);
		
		return "clientes/ok";
	}
	@RequestMapping("/clientes/formulario")
	public String formulario(){
		
		return "/clientes/formulario";
	}

}
