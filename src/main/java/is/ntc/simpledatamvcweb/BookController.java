package is.ntc.simpledatamvcweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	
	@Autowired
    BookService bookService;
	

    @GetMapping("/books")
	public String books(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "books";
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
	
	@GetMapping("/addbook")
	public String addbook(			
			@RequestParam(name="name", required=false, defaultValue="") String name, 
			@RequestParam(name="author", required=false, defaultValue="") String author,
			@RequestParam(name="publisher", required=false, defaultValue="") String publisher,
			@RequestParam(name="year", required=false, defaultValue="2000") short year,
			Model model) {
		model.addAttribute("book", new Book(name, author, publisher, year));
		return "addbook";
	}
	
	@PostMapping("/addbook")
	  public String addbookSubmit(@ModelAttribute Book book) {
		bookService.saveOrUpdate(book);
		return "newbook";
	}
	
    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id) {
    	bookService.delete(id);
    }
}
