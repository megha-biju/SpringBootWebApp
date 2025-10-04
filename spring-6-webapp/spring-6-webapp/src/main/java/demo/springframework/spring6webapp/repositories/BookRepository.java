package demo.springframework.spring6webapp.repositories;

import demo.springframework.spring6webapp.domain.Author;
import demo.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
