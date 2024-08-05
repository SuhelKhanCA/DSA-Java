package JCF;

import java.util.LinkedList;
import java.util.List;

class Book{
    int accNo;
    String title, author, publisher;
    double cost;

    // constructor of the class
    Book(int id, String title, String author, String publisher, double cost ){
        this.accNo = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
    }
    @Override
    public String toString(){
        return "{" + this.accNo + "--" + this.title + "--" + this.author + "--" + this.publisher + "--" + this.cost + "}";
    }
}
public class ADTLinkedList {
    public static void main(String[] args) {
        List<Book> library = new LinkedList<Book>();

        // creating a list of books
        Book b1 = new Book(1, "A", "Aa", "AAa", 10);
        Book b2 = new Book(2, "B", "Ba", "BAa", 20);
        Book b3 = new Book(3, "C", "Ca", "CAa", 30);
        Book b4 = new Book(4, "D", "Da", "DAa", 40);
        Book b5 = new Book(5, "E", "Ea", "EAa", 50);
        Book b6 = new Book(6, "F", "Fa", "FAa", 60);
        Book b7 = new Book(7, "G", "Ga", "GAa", 70);

        //adding to the list
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        library.add(b6);
        library.add(b7);

        for (int i = 0; i < library.size(); i++) {
            System.out.print(library.get(i).toString() +  "-> ");
        }
        System.out.println("END");

        // printing another way
        for (Book b : library) {
            System.out.println("Book ID: " + b.accNo);
            System.out.println(b.title + " " + b.author + " " + b.publisher);
            System.out.println(b.cost);
            System.out.println();
        }
    }
}
