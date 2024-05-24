package id.ac.ui.cs.advprog.bookdetail.controller;

import id.ac.ui.cs.advprog.bookdetail.models.Book;
import id.ac.ui.cs.advprog.bookdetail.models.ShoppingCart;
import id.ac.ui.cs.advprog.bookdetail.services.BookDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class ShoppingCartController {

    @Autowired
    private ShoppingCart shoppingCart;

    @Autowired
    private BookDetailServices bookService;
    @GetMapping("/daftarbuku")
    public String productListPage(Model model){
        List<Book> books = bookService.findAllBook();
        model.addAttribute("books", books);
        return "daftarbuku";
    }

//    @PostMapping("/cart/books")
//    public ResponseEntity<Void> addItemToCart(@RequestBody Book book) {
//        shoppingCart.addBook(book);
//        return ResponseEntity.ok().build();
//    }
}