import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getISBN().equals(ISBN)) {
                this.books.remove(i);
                i = this.books.size();
            }
        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book b : this.books) {
            if (b.getTitle().equals(title)) {
                foundBooks.add(b);
            }
        }
        return (Book[]) foundBooks.toArray();
    }

    public Book[] displayBooks() {
        return (Book[]) this.books.toArray();
    }
}
