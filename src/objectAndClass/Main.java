package objectAndClass;

public class Main {


    public static void main(String[] args) {
        //Author
        Author JohnTolkien = new Author("John",  "Tolkien");
        System.out.println("firstName = " + JohnTolkien.getFirstName());
        System.out.println("lastName = " + JohnTolkien.getLastName());

        Author LevTolstoi = new Author("Lev", "Tolstoi");
        System.out.println("firstName = " + LevTolstoi.getFirstName());
        System.out.println("lastName = " + LevTolstoi.getLastName());
        //Book
        Book Hobbits = new Book("Hobbits", "JohnTolkien", 2015);
        System.out.println("Hobbits = " + Hobbits.getBookName());
        System.out.println("Hobbits = " + Hobbits.getNameAuthor());
        System.out.println("Hobbits = " + Hobbits.getPublicationYear());
        Hobbits.setPublicationYear(2020);
        System.out.println("Hobbits.getPublicationYear() = " + Hobbits.getPublicationYear());

        Book WarAndPeace = new Book("WarAndPeace", "Lev Tolstoi", 2005);
        System.out.println("WarAndPeace = " + WarAndPeace.getBookName());
        System.out.println("WarAndPeace = " + WarAndPeace.getNameAuthor());
        System.out.println("WarAndPeace = " + WarAndPeace.getPublicationYear());
        WarAndPeace.setPublicationYear(2020);
        System.out.println("WarAndPeace = " + WarAndPeace.getPublicationYear());
    }
}
