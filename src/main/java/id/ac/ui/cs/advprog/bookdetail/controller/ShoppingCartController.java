package id.ac.ui.cs.advprog.bookdetail.controller;

import id.ac.ui.cs.advprog.admin.models.Book;
import id.ac.ui.cs.advprog.bookdetail.models.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class ShoppingCartController {

    @Autowired
    private ShoppingCart shoppingCart;

    @PostMapping("/cart/books")
    public ResponseEntity<Void> addItemToCart(@RequestBody Book book) {
        shoppingCart.addBook(book);
        return ResponseEntity.ok().build();
    }
}