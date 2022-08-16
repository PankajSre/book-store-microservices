package com.iiht.training.bookstore.rentbook.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.rentbook.entity.Books;


public interface BooksRepository extends JpaRepository<Books, Integer> {

	
}
