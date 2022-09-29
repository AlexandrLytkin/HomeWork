package objectAndClass;

public class Author {
    private String name;

    public static Author Author(String nameAuthor) {
        Author author = new Author();
        author.name = nameAuthor;
        return author;
    }

    public String getName() {
        return this.name;
    }
}
