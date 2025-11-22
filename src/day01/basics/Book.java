package day01.basics;

public class Book {
    String title;
    String author;
    int pages;

    void displayInfo() {
        System.out.println("Tittle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    boolean isLongBook() {
        return pages > 300;
    }
}
