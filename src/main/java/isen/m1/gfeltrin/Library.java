package isen.m1.gfeltrin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Library implements BookFactory{

    static Library instance;
    private Library(){
    }

    public Book newBook(){
        return null;
    }

    @Override
    public Book newBook(String title) throws IllegalArgumentException {
        if (title != null){
            return new Book(title);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static synchronized Library getInstance(){
        if (instance == null){
            instance = new Library();
        }
        return instance;
    }
}
