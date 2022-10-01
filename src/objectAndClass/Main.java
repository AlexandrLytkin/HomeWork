package objectAndClass;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        // Author
        Author JohnTolkien = new Author("John", "Tolkien");
        Author LevTolstoi = new Author("Lev", "Tolstoi");
        // Book
        Book Hobbits = new Book("Hobbits",JohnTolkien, 2005);
        Book WarAndPeace =  new Book("WarAndPeace", LevTolstoi, 2010);

        System.out.println("Hobbits.getBookName() = " + Hobbits.getBookName());
        System.out.println("Hobbits.getAuthor().getName() = " + Hobbits.getAuthor().getName() + " " + Hobbits.getAuthor().getLastName());
        System.out.println("Hobbits.getPublishingYear() = " + Hobbits.getPublishingYear());
        System.out.println("WarAndPeace.getBookName() = " + WarAndPeace.getBookName());
        System.out.println("WarAndPeace.getAuthor().getName() = " + WarAndPeace.getAuthor().getName() + " " + WarAndPeace.getAuthor().getLastName());
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
        Hobbits.setPublishingYear(2020);
        WarAndPeace.setPublishingYear(2022);
        System.out.println("Hobbits.getPublishingYear() = " + Hobbits.getPublishingYear());
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());

    }
}

