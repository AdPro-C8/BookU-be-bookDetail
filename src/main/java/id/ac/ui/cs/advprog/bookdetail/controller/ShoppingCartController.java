package id.ac.ui.cs.advprog.bookdetail.controller;

import id.ac.ui.cs.advprog.admin.models.Book;
import id.ac.ui.cs.advprog.bookdetail.models.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShoppingCartController {
    private ShoppingCart shoppingCart;

    @PostMapping("/cart/items")
    public ResponseEntity<Void> addItemToCart(@RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/cart/items/{title}")
    public ResponseEntity<Void> removeItemFromCart(@PathVariable String title) {
        return ResponseEntity.ok().build();
    }
}