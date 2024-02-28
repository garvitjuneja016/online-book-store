package com.garvit.onlinebookstore.dao;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.garvit.onlinebookstore.entity.BookUser;
import com.garvit.onlinebookstore.entity.BookUserId;


@RepositoryRestResource
public interface BookUserRepository extends JpaRepository<BookUser, BookUserId> {

	@Modifying
	@Transactional
	@Query(value="Insert into book_user(book_id,customer_id) values(?1, ?2)", nativeQuery = true)
	public int addBookToUser(int bookId, String customerId);
	
	@Modifying
	@Transactional
	@Query(value="select book_id from book_user where customer_id = ?1", nativeQuery = true)
	public Set<Integer> getPurchasedBooks(String customerId);
	
	
}
