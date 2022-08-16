package com.iiht.training.bookstore.addbooks.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.addbooks.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	
}
