package id.ac.ui.cs.advprog.bookdetail.repository;
import id.ac.ui.cs.advprog.bookdetail.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDetailRepository extends JpaRepository<Book, Long> {

}