package LibraryBookManagementSystem;

public class DriverClass {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook(new Book(1, "Harry Potter 1", "J.K. Rowling", 2000, 1000));
		lib.addBook(new Book(10, "Harry Potter 2", "J.K. Rowling", 2003, 2000));
		lib.addBook(new Book(1, "The Alchemist", "Author 1", 2005, 500));
		lib.addBook(new Book(5, "Rich Dad Poor Dad", "Author 2 ", 2001, 1000));
		lib.addBook(new Book(2, "Harry Potter 3", "J.K. Rowling", 2005, 2500));
		
		
		
		lib.findBookByAuthor("J.K. Rowling").forEach(System.out::println);
		System.out.println();
		
		lib.findLatestBook(2003).forEach(System.out::println);
		System.out.println();
		
		lib.findBooksByComplexCriteria(2001,100,"row").forEach(System.out::println);
		
	}
}
