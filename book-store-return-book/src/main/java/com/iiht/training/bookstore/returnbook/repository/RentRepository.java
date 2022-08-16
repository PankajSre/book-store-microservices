package com.iiht.training.bookstore.returnbook.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.returnbook.entity.Rent;

public interface RentRepository extends JpaRepository<Rent, Integer> {

	
}
