package demo.springframework.spring6webapp.services;

import demo.springframework.spring6webapp.domain.Author;
import demo.springframework.spring6webapp.domain.Book;

public interface AuthorService {

    Iterable<Author> findAll();
}
