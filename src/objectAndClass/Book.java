package objectAndClass;

public class Book {
    private String bookName;
    private final String author;
    private int publishingYear;


    public Book(String name, String author, int publishing) {
        this.bookName = name;
        this.author = author;
        this.publishingYear = publishing;
    }


    public String getBookName() {
        return this.bookName;
    }
    public String getAuthorBook() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
