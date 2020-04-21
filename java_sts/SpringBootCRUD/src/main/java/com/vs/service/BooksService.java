package com.vs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.model.Books;
import com.vs.repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;
	
	//Getting all records by using method of findall() of Crud Repository
	
	public List<Books> getAllBooks(){
		List<Books> books =new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}
	
	//Getting a specific record by using a method getbyid
	
	public Books getById(int id) {
		 return booksRepository.findById(id).get();
	}
	
	// Saving a Particular record by save method in Crud Repository
	
	public void saveorUpdate (Books books) {
	  booksRepository.save(books);
	}
	//Updating a particular record by Id 
	
	public void update (Books books, int bookid) {
		 booksRepository.save(books);
	}
	// Deleting a record by Id
	public void delete(int id) {
		booksRepository.deleteById(id);
	}

}
