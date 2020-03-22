package isen.m1.gfeltrin;

import java.nio.file.Path;

public interface BookFactory{
   public Book newBook(String title) throws IllegalArgumentException;
}
