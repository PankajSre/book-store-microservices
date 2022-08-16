package com.iiht.training.bookstore.addbooks.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.bookstore.addbooks.entity.Books;
import com.iiht.training.bookstore.addbooks.repository.BooksRepository;

@RestController
@RequestMapping("/api")
public class BooksRestController {

	@Autowired
	private BooksRepository repository;

	@PostMapping("/add")
	public Books addBook(@Valid @RequestBody Books book, BindingResult result) {
		Books savedBook = repository.save(book);
		return savedBook;

	}
}
