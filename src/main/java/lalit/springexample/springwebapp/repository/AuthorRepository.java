package lalit.springexample.springwebapp.repository;

import lalit.springexample.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Long> {
}
