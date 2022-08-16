package com.iiht.training.bookstore.addclient.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.bookstore.addclient.entity.Clients;
import com.iiht.training.bookstore.addclient.repository.ClientsRepository;

@RestController
@RequestMapping("/api")
public class ClientsRestController {

	@Autowired
	private ClientsRepository repository;

	@PostMapping("/add")
	public Clients addBook(@Valid @RequestBody Clients client, BindingResult result) {
		Clients savedClient = repository.save(client);
		return savedClient;

	}
}
