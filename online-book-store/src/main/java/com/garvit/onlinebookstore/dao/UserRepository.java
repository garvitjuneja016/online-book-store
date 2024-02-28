package com.garvit.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.garvit.onlinebookstore.entity.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, String> {

}
