package isen.m1.gfeltrin;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class InMemoryBookDAO implements BookDAO {
    private SortedSet<Book> listBook = new ConcurrentSkipListSet<Book>();
    private static InMemoryBookDAO instance = null;

    private InMemoryBookDAO() {
    }

    @Override
    public Set<Book> findAll() {
        return listBook;
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException{
        Iterator<Book> iter = listBook.iterator();
        while (iter.hasNext()){
            Book b = iter.next();
            if (b.getIsbn().compareTo(isbn) == 0)
                return b;
        }
        throw new BookNotFoundException();
    }

    @Override
    public boolean insertBook(Book book) throws BookNotFoundException{
        for (int i = 0; i < listBook.size(); i++){
            if (book.getTitle() != null && book.getTitle().contains(book.getTitle())){
                listBook.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateBook(Book book) throws BookNotFoundException{
       Book b = findByIsbn(book.getIsbn());
        for (int i = 0; i < listBook.size(); i++){
            if (! book.getTitle().isEmpty()){
                listBook.remove(b);
                listBook.add(b);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) throws BookNotFoundException{
        Book b = findByIsbn(book.getIsbn());
        for (int i = 0; i < listBook.size(); i++){
            if (book.getTitle() != null && book.getTitle().contains(book.getTitle())){
                listBook.remove(b);
                return true;
            }
        }
        return false;
    }

    public static synchronized InMemoryBookDAO getInstance(){
        if (instance == null){
            instance = new InMemoryBookDAO();
        }
        return instance;
    }
}
