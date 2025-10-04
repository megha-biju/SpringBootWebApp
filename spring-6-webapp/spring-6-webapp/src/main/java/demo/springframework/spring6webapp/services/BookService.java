package demo.springframework.spring6webapp.services;

import demo.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
