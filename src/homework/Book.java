package homework;

public class Book {

    private String bookTitle;
    private int age;

    public Book(String bookTitle, int age) {
        this.bookTitle = bookTitle;
        this.age = age;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }


}
