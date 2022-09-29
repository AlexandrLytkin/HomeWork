package objectAndClass;

public class Main {



    public static void main(String[] args) {
        // Author
        Author JohnTolkien = Author.Author("John Tolkien ");
        System.out.println("JohnTolkien.name = " + JohnTolkien.getName());
        Author LevTolstoi = Author.Author("Lev Tolstoi");
        System.out.println("JohnTolkien.getName() = " + JohnTolkien.getName());
        System.out.println();

        // Book
        Book Hobbits = Book.Book("Hobbits", Author.Author(JohnTolkien.getName()), 2005);
        System.out.println("Hobbits.bookName = " + Hobbits.getBookName());
        System.out.println("Hobbits.authorBook = " + Hobbits.authorBook);
        System.out.println("PublishingYear.publishingYear = " + Hobbits.getPublishingYear());
        Hobbits.setPublishingYear(2020);
        System.out.println("Hobbits.getPublishingYear() = " + Hobbits.getPublishingYear());
        Book WarAndPeace = Book.Book("WarAndPeace", Author.Author(LevTolstoi.getName()), 2010);
        System.out.println("WarAndPeace.getBookName() = " + WarAndPeace.getBookName());
        System.out.println("WarAndPeace.getAuthorBook() = " + WarAndPeace.getAuthorBook());
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
        WarAndPeace.setPublishingYear(2022);
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
    }
}

