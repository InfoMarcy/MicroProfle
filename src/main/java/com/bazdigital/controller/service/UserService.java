package com.bazdigital.controller.service;

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
					"mercy", "secret", "Marcy", "Esmelin", "Garcia", "Lorenzo", "Marcysmerlin@hotmail.com", "5510213679",  28, "M", "developer", "casado", "GALM90001", "Dominicano", "GALM90001HNE02RRR2","1990-02-01", "Extranjero", "url",
					 Arrays.asList(
							    new Domicilio("Moctezuma", "91", "102", "Soto y Lerdo", "Guerrero", "Cuauhtemoc", "Ciuidad de Mexico", "Mexico", "06300")
							 )
					);
					
					
					User usuario2 = new User(
					"juana", "secret", "Juana", "", "Cortes", "Rojas", "jauana@hotmail.com", "5510213979", 25, "F", "Asisente de Credito", "Soltera", "JAN90001", "Mexicana", "JAN90001HNE02RRR2","1990-02-01", "Mexico",  "url",
					 Arrays.asList(
							    new Domicilio("Luis Quintero", "102", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "07300")
							 )
					 
					);
					
					listaDeUsuarios.add(usuario1);
					listaDeUsuarios.add(usuario2);	
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
	    
	    
}
