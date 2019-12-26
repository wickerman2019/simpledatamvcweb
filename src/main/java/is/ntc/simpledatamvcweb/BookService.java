package is.ntc.simpledatamvcweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
    BookRepository bookRepository;
	
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    public void saveOrUpdate(Book book) {
        bookRepository.save(book);
    }

    public void delete(int id) {
        bookRepository.deleteById(id);
    }
	
}
