package com.iiht.training.bookstore.returnbook.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.returnbook.entity.Books;


public interface BooksRepository extends JpaRepository<Books, Integer> {

	
}
