package homework;

public class Book {

    private String bookTitle;
    private int age;
    private Author author;


    public Book(String bookTitle, int age, Author author) {
        this.bookTitle = bookTitle;
        this.age = age;
        this.author = author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Integer getAge() {
        return this.age;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return author.getName() + " " + author.getSurname();
    }

    public String toString() {
        return getBookTitle() + " " + getAge() + " " + getFullName();
    }
}
