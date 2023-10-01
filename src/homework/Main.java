package homework;

public class Main {


    public static void main(String[] args) {

        Author orwell = new Author("George", "Orwell");
        Author huxley = new Author("Aldous", "Huxley");

        System.out.println(orwell.equals(huxley));

        Book bookOne = new Book("Animal farm", 1945, orwell);
        Book bookTwo = new Book("Brave New World", 1932, huxley);

        print(bookOne);
        print(bookTwo);
    }
    public static void print(Book bookOne){
        System.out.println(bookOne.toString());
        System.out.println(bookOne.hashCode());
    }
}

