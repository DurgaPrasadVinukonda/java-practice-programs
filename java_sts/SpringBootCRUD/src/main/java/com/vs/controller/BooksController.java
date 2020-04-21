package com.vs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Books;
import com.vs.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired BooksService booksService;
	
	// Getting all Books in the List
	@GetMapping("/book")
	private List<Books> getAllBooks(){
		 return booksService.getAllBooks();
	}
	// Getting a Particular Book by Id 
	
	@GetMapping("/book/{bookid}")
	private Books getBookId(@PathVariable("bookid") int bookid ) {
		return booksService.getById(bookid);
	}
	// Deleting a Book By Id 
	@DeleteMapping("book/{bookid}")
	private void  deleteBook(@PathVariable("bookid") int bookid) {
	 booksService.delete(bookid);
	}
	//Posting a Books
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		booksService.saveorUpdate(books);
		return books.getBookid();
	}
	
	// Updating a Books
	
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveorUpdate(books);
		return books;
	}
	
	

}
