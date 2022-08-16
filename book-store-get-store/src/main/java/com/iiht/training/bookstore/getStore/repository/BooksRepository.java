package com.iiht.training.bookstore.getStore.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.getStore.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	
}
