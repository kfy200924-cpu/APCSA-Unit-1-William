package Unit6.Lab1;

public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book b) {
        if(b == null) {
         return;
        }

        for(int i = 0; i < books.length; i++) {
            if(b.getId() == books[i].getId()) {
                return;
            }
        }

        if(numBooks < books.length) {
            books[numBooks] = b;
        }
    }
}
