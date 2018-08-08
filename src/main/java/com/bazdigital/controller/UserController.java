package com.bazdigital.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bazdigital.model.User;
import com.bazdigital.service.UserService;



@ApplicationScoped
@Path("/api/users")
public class UserController {
	
	@Inject // use CDI to inject a service
	private UserService userService;

	// uses common annotations to declare a role required
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> findAll() {
		return userService.getAll();
	}
	
	
	@GET
    @Path("/{username}")
	@Produces(MediaType.APPLICATION_JSON)
    public User getBook(@PathParam("username") String username) {
        return userService.getUser(username);
    }
	
	
}
