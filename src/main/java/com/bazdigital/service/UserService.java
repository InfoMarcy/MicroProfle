package com.bazdigital.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.bazdigital.model.Domicilio;
import com.bazdigital.model.User;

@ApplicationScoped
public class UserService {

	
	//declare a list of users
	private List<User> listaDeUsuarios = new ArrayList<>();
	
	
	
	private void loadData() {
			User usuario1 = new User(
					"usuario_strong", "secret", "Hugo", "", "Cortes", "Perez", "alejandro@hotmail.com", "5510213679",  32, "M", "Desarrollador", "Casado", "GALM56000", "Cubano", "CALM87001HNE02RRR2","1990-02-01", "Extranjero", "url",
					 Arrays.asList(
							    new Domicilio("Moctezuma", "91", "102", "Soto y Lerdo", "Guerrero", "Cuauhtemoc", "Ciuidad de Mexico", "Mexico", "06800")
							 )
					);
					
					
					User usuario2 = new User(
					"naughty_vainilla", "secret", "Juana", "", "Cortes", "Rojas", "jauana@hotmail.com", "5510213979", 25, "F", "Asisente de Credito", "Soltera", "JAN67001", "Mexicana", "SOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
					 Arrays.asList(
							    new Domicilio("Luis Quintero", "102", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "07800")
							 )
					 
					);
					
					User usuario3 = new User(
							"Bailarina01", "bestdancerever", "Karina", "", "De La Rosa", "Rojas", "karina@hotmail.com", "5510213979", 19, "F", "Bartender", "Soltera", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
							 Arrays.asList(
									    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
									 )
							 
							);
					
					User usuario4 = new User(
							"developer", "1234567", "Daniel", "", "Morales", "Rojas", "daniel@hotmail.com", "5510213979", 19, "F", "Bartender", "Soltera", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
							 Arrays.asList(
									    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
									 )
							 
							);
					
					User usuario5 = new User(
							"angelito01", "angelcorrea", "Angel", "", "Correa", "Ortiz", "angel@hotmail.com", "5510213979", 19, "F", "Supervisor", "Casado", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
							 Arrays.asList(
									    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
									 )
							 
							);
					
					listaDeUsuarios.add(usuario1);
					listaDeUsuarios.add(usuario2);	
					listaDeUsuarios.add(usuario3);	
					listaDeUsuarios.add(usuario4);	
					listaDeUsuarios.add(usuario5);	
	}
	

	 
	 
	 public List<User> getAll() {
		 loadData();
		 
	        return listaDeUsuarios;
	    }

	    public User getUser(String username) {
	    	 loadData();
	    	User usuario = listaDeUsuarios.stream().filter(user -> username.equals(user.getUsername())).findAny().orElse(null);
	    	
	    	
	        return usuario;
	    }
	    
	    public User getUserById(String id) {
	    	 loadData();
	    	User usuario = listaDeUsuarios.stream().filter(user -> id.equals(user.getId())).findAny().orElse(null);
	    	
	    	
	        return usuario;
	    }
	    
	    
}
