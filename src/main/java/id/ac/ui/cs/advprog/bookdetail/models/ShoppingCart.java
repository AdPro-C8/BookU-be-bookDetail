package id.ac.ui.cs.advprog.bookdetail.models;

import id.ac.ui.cs.advprog.admin.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ShoppingCart{
    private List<Observer> observers;
    private List<Book> items;
    private double totalCost;

    public ShoppingCart() {
        observers = new ArrayList<>();
        items = new ArrayList<>();
    }
}
