package py.edu.facitec.springhibernate.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //Indicamos que se trata de una entidad a persistir en la bd
public class Cliente {
	
	@Id //Clave Primaria
	@GeneratedValue //Generacion automatica de codigo
	private Integer id;
	private String nombre;
	private String correo;
	
	//Relacion de Uno para muchos donde esta el 1
	@OneToMany(mappedBy="cliente")//es opcional inicializar
	private List<Pedido> pedidos=new ArrayList<>();
	
	public Cliente(){
	pedidos=new ArrayList<>();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	

}
