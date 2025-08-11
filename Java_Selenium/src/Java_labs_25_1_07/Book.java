package Java_labs_25_1_07;

public class Book 
{
	    private String title;
	    private String author;
	    private String isbn;
	    private boolean isAvailable;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isAvailable = true;
	    }
	    public void issueBook() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("Book issued: " + title);
	        } else {
	            System.out.println("Book is not available for issuing: " + title);
	        }
	    }

	
	    public void returnBook() {
	        isAvailable = true;
	        System.out.println("Book returned: " + title);
	    }
	    
	    public String getBookInfo() {
	        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
	    }
	    
	      public static void main(String[] args) {
	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
	        System.out.println(book1.getBookInfo());
	        book1.issueBook();
	        book1.issueBook();
	        book1.returnBook();
	        System.out.println(book1.getBookInfo());
	    }
	}



