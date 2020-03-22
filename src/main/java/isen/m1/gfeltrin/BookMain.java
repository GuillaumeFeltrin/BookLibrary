package isen.m1.gfeltrin;

import java.io.IOException;

public class BookMain {
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        /*PaperBook pBook = new PaperBook("Times");
        KindleBook kBook = new KindleBook("Test");
        System.out.println("Paper Book title : "+ pBook.getTitle());
        System.out.println("Kindle Book title : "+ kBook.getTitle());*/

        /*Book b1 = new Book("Lord of the Rings");
        Book b2 = new Book("Lord of the Rings 2");
        Book b3 = new Book("Lord of the Rings 3");
        b1.addBookServer(b1);
        b2.addBookServer(b2);
        b3.addBookServer(b3);*/

        Book book = new Book("");
        book.setTitle("Star Wars");
        book.addBookServer(book);
        book.readBookServer();
    }
}
