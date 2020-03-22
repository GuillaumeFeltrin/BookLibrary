package isen.m1.gfeltrin;

import java.util.Set;

public interface BookDAO {
    Set<Book> findAll ();
    Book findByIsbn (String isbn) throws BookNotFoundException;
    boolean insertBook (Book book) throws BookNotFoundException;
    boolean updateBook (Book book) throws BookNotFoundException;
    boolean deleteBook (Book book) throws BookNotFoundException;
}
