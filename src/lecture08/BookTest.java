package lecture08;

public class BookTest {
	public static void main(String[] args) {
		Book[] books = new Book[6];
		
		books[0] = new Novel("칼의 노래", "김훈");
		books[1] = new Novel("칼의 노래", "김훈");
				
		for (Book b : books) {
			System.out.println(b);
		}
		System.out.println("같은 책?: " + books[0].equals(books[1]));
	}
}

