package lalit.springexample.springwebapp.repository;


import lalit.springexample.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
