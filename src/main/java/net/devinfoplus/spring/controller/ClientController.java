package net.devinfoplus.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.devinfoplus.spring.model.Client;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/clients"})
public class ClientController {
	
	private List<Client> clients = createList();
	
	@GetMapping(produces ="application/json")
	public List<Client> fisrtPage(){
		return clients;
	}
	
	@DeleteMapping(path = { "/{id}" })
	public Client delete(@PathVariable("id") int id) {
		Client deletecl = null;
		for(Client cl : clients) {
			if(cl.getId().equals("id")) {
				clients.remove(cl);
				deletecl = cl;
				break;
			}
		}
		return deletecl;
	}
	
	
	@PostMapping
	public Client create(@RequestBody Client user) {
		clients.add(user);
		System.out.println(clients);
		return user;
		}
	
	private static List<Client> createList(){
		List<Client> tempClients = new ArrayList<>();
		Client cl1 = new Client();
		cl1.setNom("client1");
		cl1.setFonction("manager");
		cl1.setId("1");
		cl1.setSalaire(2500);
		
		Client cl2 = new Client();
		cl2.setNom("client2");
		cl2.setFonction("developer");
		cl2.setId("2");
		cl2.setSalaire(5000);
		
		tempClients.add(cl1);
		tempClients.add(cl2);
		
		return tempClients;
		
	}
	

}
