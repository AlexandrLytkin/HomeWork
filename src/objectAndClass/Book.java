package objectAndClass;

import java.rmi.activation.ActivationGroup_Stub;

public class Book {
    private String bookName;
    private final Author author;
    private int publishingYear;


    public Book(String name, Author author, int publishing) {
        this.bookName = name;
        this.author = author;
        this.publishingYear = publishing;
    }

    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthorBook() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
