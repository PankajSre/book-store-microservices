package com.iiht.training.bookstore.rentbook.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.rentbook.entity.Rent;

public interface RentRepository extends JpaRepository<Rent, Integer> {

	
}
