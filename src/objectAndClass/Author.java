package objectAndClass;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstName = firstNameAuthor;
        this.lastName = lastNameAuthor;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
