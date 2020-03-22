package isen.m1.gfeltrin;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.Date;

public class Book {

    private String isbn;
    private String title;
    private Double price;
    private Date issueDate;

    public Book(){
        super();
    }

    public Book(String title){
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Boolean testTitleNotNull(String title){
        if (title.isEmpty() == true){
            return false;
        }
        else{
            return true;
        }
    }

    public void addBookServer(Book book){
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("books_library.txt");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(book);
            System.out.println("Done");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readBookServer() throws IOException {
        BufferedReader lecteurAvecBuffer = null;
        String ligne;
        try
        {
            lecteurAvecBuffer = new BufferedReader(new FileReader("books_library.txt"));
        }
        catch(FileNotFoundException exc)
        {
            System.out.println("Erreur d'ouverture");
        }
        while ((ligne = lecteurAvecBuffer.readLine()) != null)
            System.out.println(ligne);
        lecteurAvecBuffer.close();
    }

}
