public class LibrarySystem {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", author1, "978-0590353403");
        Library library = new Library();
        library.addBook(book1);
        library.displayBooks();
    }
}

class Author {
    private String name;
    public Author(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;
    private String isbn;

    public Book(String title, Author author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        // Assume the library can hold up to 100 books
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor().getName());
            System.out.println("ISBN: " + books[i].getIsbn() + "\n");
        }
    }
}
