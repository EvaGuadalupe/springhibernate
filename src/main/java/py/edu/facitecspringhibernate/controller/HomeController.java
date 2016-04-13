package py.edu.facitecspringhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Responde a la URL / Qque es la raiz del proyecto
	@RequestMapping("/")
	public String index(){
		
		System.out.println("Cargando la pagina de Bienvenida");
		return "hello-world";
	}

}
