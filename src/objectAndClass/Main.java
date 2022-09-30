package objectAndClass;

public class Main {

    public static void main(String[] args) {
        // Author
        Author JohnTolkien = new Author("John Tolkien");
        System.out.println("JohnTolkien.name = " + JohnTolkien.getAuthor());
        Author LevTolstoi = new Author("Lev Tolstoi");
        System.out.println("JohnTolkien.getName() = " + LevTolstoi.getAuthor());
        System.out.println();
        // Book
        Book Hobbits = new Book("Hobbits",new Author(JohnTolkien.author), 2005);
        System.out.println("Hobbits.bookName = " + Hobbits.getBookName());
        System.out.println("Hobbits.authorBook = " + Hobbits.getAuthorBook());
        System.out.println("PublishingYear.publishingYear = " + Hobbits.getPublishingYear());
        Hobbits.setPublishingYear(2020);
        System.out.println("Hobbits.getPublishingYear() = " + Hobbits.getPublishingYear());
        System.out.println();
        Book WarAndPeace =  new Book("WarAndPeace", LevTolstoi, 2010);
        System.out.println("WarAndPeace.getBookName() = " + WarAndPeace.getBookName());
        System.out.println("WarAndPeace.getAuthorBook() = " + WarAndPeace.getAuthorBook());
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
        WarAndPeace.setPublishingYear(2022);
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
    }
}

