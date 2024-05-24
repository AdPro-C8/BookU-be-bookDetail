package id.ac.ui.cs.advprog.bookdetail.controller;

import id.ac.ui.cs.advprog.bookdetail.models.Book;
import id.ac.ui.cs.advprog.bookdetail.services.BookDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@RestController
public class BookDetailController {

    @Autowired
    private BookDetailServices bookService;

    @RequestMapping(value = "/api/book-details/{id}", method = RequestMethod.GET)
    public ResponseEntity getBookDetails(@PathVariable long id){
        ResponseEntity responseEntity = null;
        try {
            Optional<Book> book = bookService.findById(id);
            responseEntity = ResponseEntity.ok(book);
        } catch (Exception e){
            responseEntity = ResponseEntity.badRequest().body(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("/api/book-details")
    public ResponseEntity<List<Book>> getAllBooks() {
        try {
            List<Book> books = bookService.findAllBook();
            return ResponseEntity.ok(books);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}