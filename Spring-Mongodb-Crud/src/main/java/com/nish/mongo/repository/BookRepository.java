package com.nish.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nish.mongo.model.Book;



public interface BookRepository extends MongoRepository<Book, Integer>{

}

