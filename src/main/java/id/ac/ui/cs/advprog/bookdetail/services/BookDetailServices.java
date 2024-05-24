package id.ac.ui.cs.advprog.bookdetail.services;

import id.ac.ui.cs.advprog.bookdetail.models.Book;
import id.ac.ui.cs.advprog.bookdetail.repository.BookDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookDetailServices {

    @Autowired
    private BookDetailRepository bookDetailepository;

    public Book saveBook(Book book) {
        return bookDetailepository.save(book);
    }

    public List<Book> findAllBook(){
        List<Book> allBook = bookDetailepository.findAll();
        return allBook;
    }

    public Optional<Book> findById(long id) {
        return bookDetailepository.findById(id);
    }
}