package com.vs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vs.model.Books;


@Repository
public interface BooksRepository extends CrudRepository<Books,Integer> {

}
