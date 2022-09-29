package objectAndClass;

public class Book {
    private String bookName;
    String authorBook;
    private int publishingYear;


    public static Book Book(String name, Author author, int publishing) {
        Book book = new Book();
        book.bookName = name;
        book.authorBook = author.getName();
        book.publishingYear = publishing;
        return book;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
