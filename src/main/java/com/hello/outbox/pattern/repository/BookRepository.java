package com.hello.outbox.pattern.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hello.outbox.pattern.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {}
