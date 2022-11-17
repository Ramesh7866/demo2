package com.javafsd.Swaggerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.Swaggerdemo.entity.Book;
import com.javafsd.Swaggerdemo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		Book bookSave = bookRepository.save(book);
		return bookSave;
		
	}

	public List<Book> getAllBooks() {
		List<Book> bookDB =  bookRepository.findAll();
		return bookDB;
	}

}