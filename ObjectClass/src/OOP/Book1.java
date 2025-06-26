package OOP;

public class Book1 {

	String title;
	String author;
	String genre;
	String lang;
	int price;
	public Book1(String title, String author, String genre, String lang, int price) {
		this(title, author, lang, price);
		this.genre = genre;
	}
	public Book1(String title, String author, String lang, int price) {
		this(title, author, price);
		this.lang = lang;
	}
	public Book1(String title, String author, int price) {
		this(title, price);
		this.author = author;
	}
	public Book1(String title, int price){
		super();
		this.title = title;
		this.price = price;
	}
	
	public void showDetails() {

		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Language : "+lang);
		System.out.println("Genre : "+genre);
		System.out.println("Price : "+price);

	}
	
	
}
