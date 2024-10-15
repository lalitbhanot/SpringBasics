package lalit.springexample.springwebapp.bootstrap;

import lalit.springexample.springwebapp.domain.Author;
import lalit.springexample.springwebapp.domain.Book;
import lalit.springexample.springwebapp.domain.Publisher;
import lalit.springexample.springwebapp.repository.AuthorRepository;
import lalit.springexample.springwebapp.repository.BookRepository;
import lalit.springexample.springwebapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner  {
    private final AuthorRepository authorRepository ;
    private final BookRepository bookRepository ;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this. publisherRepository = publisherRepository ;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("af1","al1");
        Book book1 = new Book("abook1","1234");
        a1.getBook().add(book1);
        book1.getAuthors().add(a1) ;

        Author a2 = new Author("af2","al2");
        Book book2 = new Book("abook2","12342");
        a2.getBook().add(book2);
        book2.getAuthors().add(a2) ;
        authorRepository.save(a2) ;
        bookRepository.save(book2);
        Publisher pub1 = new Publisher("pubName", "pubAddress");

        book2.setPublisher(pub1);
        pub1.getBooks().add(book1);

        authorRepository.save(a1) ;
        bookRepository.save(book1);
        publisherRepository.save(pub1);
        System.out.println("Number of pub " + publisherRepository.count() + " Number of Books and Author" +bookRepository.count() );

    }
}
