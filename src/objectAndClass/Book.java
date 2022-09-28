package objectAndClass;

public class Book {
    private String bookName;
    private String nameAuthor;
    private int publicationYear;

    public Book(String bookName, String nameAuthor, int publicationYear) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return this.bookName;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
         this.publicationYear = publicationYear;
    }

}

