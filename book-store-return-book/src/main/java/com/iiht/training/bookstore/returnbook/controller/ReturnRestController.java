package com.iiht.training.bookstore.returnbook.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.bookstore.returnbook.entity.Books;
import com.iiht.training.bookstore.returnbook.entity.Rent;
import com.iiht.training.bookstore.returnbook.repository.BooksRepository;
import com.iiht.training.bookstore.returnbook.repository.RentRepository;

@RestController
@RequestMapping("/api")
public class ReturnRestController {

	@Autowired
	private RentRepository repository;

	@Autowired
	private BooksRepository bookrepository;

	@PostMapping("/return")
	public Rent returnBook(@Valid @RequestBody Rent rent, BindingResult result) {
		rent.setStatus("Returned");
		Rent savedRent = repository.save(rent);

		Books book = bookrepository.getById(rent.getBookId());
		book.setAvailable(book.getAvailable() + 1);
		book.setRented(book.getRented() - 1);

		bookrepository.save(book);
		return savedRent;

	}
}
