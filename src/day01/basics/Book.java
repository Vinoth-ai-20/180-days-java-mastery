package day01.basics;

public class Book {

    //encapsulated variables
    private String title;
    private String author;
    private int pages;

    //Default Constructor
    public Book() {
        this.title = "Unknow";
        this.author = "Unknow";
        this.pages = 0;
    }

    //Parametrized Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Page number must be Positive.");
        }
    }

    void displayInfo() {
        System.out.println("Tittle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    boolean isLongBook() {
        return pages > 300;
    }
}
