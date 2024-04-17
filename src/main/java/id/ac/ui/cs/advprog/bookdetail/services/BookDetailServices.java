package id.ac.ui.cs.advprog.bookdetail.services;

import id.ac.ui.cs.advprog.admin.models.Book;
import id.ac.ui.cs.advprog.bookdetail.repository.BookDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDetailServices {

    @Autowired
    private BookDetailRepository bookDetailepository;

    public Book saveBook(Book book) {
        return bookDetailepository.save(book);
    }
}