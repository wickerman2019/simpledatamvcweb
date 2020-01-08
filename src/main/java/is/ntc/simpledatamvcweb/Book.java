package is.ntc.simpledatamvcweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private  int id;
	  private String name;
	  private String author;
	  private String publisher;
	  private short year;
	  
	  Book () {};
	  
	  public Book(String name, String author, String publisher, short year) {
		    this.name = name;
		    this.author = author;
		    this.publisher = publisher;
		    this.year = year;
	  }
	  
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public short getYear() {
		return year;
	}

}
