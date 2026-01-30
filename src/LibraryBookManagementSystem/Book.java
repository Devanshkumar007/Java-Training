package LibraryBookManagementSystem;


public class Book {
	private int id;
	private String title;
	private String author;
	private int yearPublished;
	private int numberOfPages;
	public Book(int id, String title, String author, int yearPublished, int numberOfPages) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.numberOfPages = numberOfPages;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished
				+ ", numberOfPages=" + numberOfPages + "]";
	}
	
	
	
}
