package com.garvit.onlinebookstore.service;

import java.util.Set;

import com.garvit.onlinebookstore.entity.Book;
import com.garvit.onlinebookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
