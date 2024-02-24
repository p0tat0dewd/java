class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}

class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, String issue) {
        super(title, author);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("relativity for 6 y/o", "patootie", 500);
        DVD dvd = new DVD("Movie Name", "Director Name", 120);
        Magazine magazine = new Magazine("National Geographic", "National Geographic Society", "January 2024");

        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page Count: " + book.getPageCount());
        System.out.println("DVD: " + dvd.getTitle() + ", Author: " + dvd.getAuthor() + ", Duration: " + dvd.getDuration() + " minutes");
        System.out.println("Magazine: " + magazine.getTitle() + ", Author: " + magazine.getAuthor() + ", Issue: " + magazine.getIssue());
    }
}
