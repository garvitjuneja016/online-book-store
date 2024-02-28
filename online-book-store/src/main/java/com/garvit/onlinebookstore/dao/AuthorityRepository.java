package com.garvit.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.garvit.onlinebookstore.entity.Authority;
import com.garvit.onlinebookstore.entity.AuthorityId;

@RepositoryRestResource
public interface AuthorityRepository extends JpaRepository<Authority, AuthorityId> {

}
