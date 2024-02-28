package com.garvit.onlinebookstore.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.garvit.onlinebookstore.entity.Customer;
import com.garvit.onlinebookstore.entity.PurchaseHistory;

@RepositoryRestResource
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, String> {

	@Query("from PurchaseHistory where customer = ?1")
	Set<PurchaseHistory> findAllByCustomer(Customer customer);

}
