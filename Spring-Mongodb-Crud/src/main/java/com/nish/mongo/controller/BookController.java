package com.nish.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nish.mongo.model.Book;
import com.nish.mongo.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository repository;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with id : " + book.getId();
	}

	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findBookById/{id}")
	public Book getBook(@PathVariable int id) {
		return repository.findOne(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.delete(id);
		return "book deleted with id : " + id;
	}
}
