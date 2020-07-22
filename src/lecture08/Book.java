package lecture08;

import java.util.Objects;

import com.sun.org.apache.xpath.internal.operations.Equals;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	public static int countOfBooks = 0; //카운트 같은 애들은 객체안에서 증가해서 놀면 안되고 공통적으로 늘어야 하니까 공적으로 사용
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		countOfBooks++;
		number = countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	
	
	
	public abstract int getLateFee(int lateDays);
	
	@Override
	public String toString() {
		return String.format("제목: %s, 작가: %s 일주일연채료: %,d원", title,author, getLateFee(7));
	}
	
}
