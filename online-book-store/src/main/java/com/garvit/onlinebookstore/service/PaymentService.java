package com.garvit.onlinebookstore.service;

import java.util.Set;

import com.garvit.onlinebookstore.entity.Customer;
import com.garvit.onlinebookstore.entity.PurchaseDetail;
import com.garvit.onlinebookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
