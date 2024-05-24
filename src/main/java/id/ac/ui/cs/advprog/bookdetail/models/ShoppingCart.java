package id.ac.ui.cs.advprog.bookdetail.models;

import id.ac.ui.cs.advprog.bookdetail.models.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

@Component
public class ShoppingCart{
    private List<Observer> observers;
    private List<Book> items;
    private double totalCost;

    public ShoppingCart() {
        observers = new ArrayList<>();
        items = new ArrayList<>();
    }

    public void addBook(Book book) {
        items.add(book);
    }

    public void removeBookByTitle(String title) {
        items.removeIf(book -> book.getTitle().equals(title));
    }
}
