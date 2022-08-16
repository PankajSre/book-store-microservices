package com.iiht.training.bookstore.getStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.bookstore.getStore.entity.Books;
import com.iiht.training.bookstore.getStore.repository.BooksRepository;

@RestController
@RequestMapping("/api")
public class BooksRestController {

	@Autowired
	private BooksRepository repository;

	@GetMapping("/books")
	public List<Books> getBooks() {
		return repository.findAll();

	}
}
