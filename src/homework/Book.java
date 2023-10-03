package homework;

import java.util.Objects;

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
    public int hashCode() {
        return Objects.hash(bookTitle, age);
    }
    public boolean equals(Object i) {
        if (i == null) {
            return false;
        }
        if (getClass() != i.getClass()) {
            return false;
        }
        Book book = (Book) i;
        return  book.bookTitle.equals(bookTitle) ;
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
