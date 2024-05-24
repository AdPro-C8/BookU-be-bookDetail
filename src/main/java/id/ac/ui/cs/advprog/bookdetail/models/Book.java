package id.ac.ui.cs.advprog.bookdetail.models;

import id.ac.ui.cs.advprog.bookdetail.models.BookBuilder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "book", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"title", "author"})
})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    @Getter
    private Long id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String title;

    @Column(nullable = false)
    @Getter
    @Setter
    private String author;

    @Column(nullable = false)
    @Getter
    @Setter
    private String publisher;

    @Column(nullable = false)
    @Getter
    @Setter
    private String price;

    @Getter
    @Setter
    private String tanggalTerbit;

    @Getter
    @Setter
    private String ISBN;

    @Getter
    @Setter
    private int jumlahHalaman;

    @Getter
    @Setter
    private String fotoCover;

    public static BookBuilder builder() {
        return new BookBuilder();
    }
}

