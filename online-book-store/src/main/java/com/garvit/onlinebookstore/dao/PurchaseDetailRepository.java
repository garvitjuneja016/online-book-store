package com.garvit.onlinebookstore.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.garvit.onlinebookstore.entity.PurchaseDetail;
import com.garvit.onlinebookstore.entity.PurchaseDetailId;
import com.garvit.onlinebookstore.entity.PurchaseHistory;

@RepositoryRestResource
public interface PurchaseDetailRepository extends JpaRepository<PurchaseDetail, PurchaseDetailId> {

	
	@Query("from PurchaseDetail where purchaseHistory = ?1")
	Set<PurchaseDetail> findAllByHistory(PurchaseHistory purchaseHistory);

}
