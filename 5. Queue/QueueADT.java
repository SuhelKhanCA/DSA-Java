import java.util.PriorityQueue;

class Book implements Comparable<Book> {

    int bookID;
    String name;
    String author;
    String publisher;
    int quantity;

    // constructor
    public Book(int bookID, String name, String author, String publisher, int quantity) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    // compare to method
    public int compareTo(Book b) {
        if (this.bookID > b.bookID) {
            return 1;
        } else if (this.bookID < b.bookID) {
            return -1;
        } else {
            return 0;
        }
    }
    
}

public class QueueADT {
    public static void main(String[] args) {
        PriorityQueue<Book> queue = new PriorityQueue<>();
        // creating books
        Book book1 = new Book(1, "Book1", "Author1", "Publisher1", 8);
        Book book2 = new Book(2, "Book2", "Author2", "Publisher2", 10);
        Book book3 = new Book(3, "Book3", "Author3", "Publisher3", 12);

        queue.add(book1);
        queue.add(book2);
        queue.add(book3);

        System.out.println(queue);

        for (Book book : queue) {
            System.out.println(book.bookID+ "---" + book.name + "---" + book.author + "---" + book.publisher + "---" + book.quantity);
        }
    }
}
