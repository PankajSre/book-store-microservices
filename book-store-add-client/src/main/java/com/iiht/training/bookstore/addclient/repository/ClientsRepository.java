package com.iiht.training.bookstore.addclient.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.bookstore.addclient.entity.Clients;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {

	
}
