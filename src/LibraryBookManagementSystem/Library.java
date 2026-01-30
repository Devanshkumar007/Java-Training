package LibraryBookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	List<Book> books;

	public Library() {
		super();
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public List<Book> findBookByAuthor(String author) {
		return books.stream().filter(b -> b.getAuthor().equals(author)).collect(Collectors.toList());
	}
	
	public List<Book> findLatestBook(int yearThreshold) {
		return books.stream().filter(a-> a.getYearPublished()>=yearThreshold).collect(Collectors.toList());
	}
	
	public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring){
		
		return books.stream().filter(a-> a.getYearPublished()>=year).
		filter(a-> a.getNumberOfPages() >= minPages).
		filter(a-> a.getAuthor().toLowerCase().contains(authorSubstring)).collect(Collectors.toList());
		
		
	}
	
}
