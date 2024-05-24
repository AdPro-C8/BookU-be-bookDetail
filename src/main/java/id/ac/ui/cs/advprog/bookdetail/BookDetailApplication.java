package id.ac.ui.cs.advprog.bookdetail;

import id.ac.ui.cs.advprog.bookdetail.models.Book;
import id.ac.ui.cs.advprog.bookdetail.repository.BookDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookDetailApplication.class, args);
    }

}
