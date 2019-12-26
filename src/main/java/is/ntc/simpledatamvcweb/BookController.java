package is.ntc.simpledatamvcweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
	
	@Autowired
    BookService bookService;
	
    @GetMapping("/books")
    private List<Book> getAllPersons() {
        return bookService.getAllBooks();
    }
    
	@GetMapping("/book/{id}")
	public String book(Model model, @PathVariable int id) {
		Book book1 = bookService.getBookById(id);
		model.addAttribute("id", id);
		model.addAttribute("name", book1.getName());
		model.addAttribute("author", book1.getAuthor());
		model.addAttribute("publisher", book1.getPublisher());
		model.addAttribute("year", book1.getYear());
		return "book";
	}
}
