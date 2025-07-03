import java.util.*;

class Book {
    int serial_number;
    String book_name;
    String author;
    int rate;

    Book(int serial_number, String book_name, String author, int rate) {
        this.serial_number = serial_number;
        this.book_name = book_name;
        this.author = author;
        this.rate = rate;
    }

    public void display() {
        System.out.println("Serial No: " + serial_number + ", Book: " + book_name + ", Author: " + author + ", Rate: " + rate);
    }
}

class LibraryService {
    public Book[] AddingBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books to add: ");
        int count = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Serial number: ");
            int serial_number = sc.nextInt();
            sc.nextLine();

            System.out.print("Book name: ");
            String book_name = sc.nextLine();

            System.out.print("Author name: ");
            String author = sc.nextLine();

            System.out.print("Rate: ");
            int rate = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(serial_number, book_name, author, rate);
        }
        return books;
    }

    public void displayAll(Book[] books) {
        System.out.println("\n--- Book Details ---");
        for (Book b : books) {
            b.display();
        }
    }
}

class FetchBook {
    public void FetchDetails(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSearch Book By:");
        System.out.println("1 - Serial Number");
        System.out.println("2 - Book Name");
        System.out.println("3 - Author Name");
        System.out.println("4 - Rate");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();  

        boolean found = false;

        switch (choice) {
            case 1:
                System.out.print("Enter Serial Number to search: ");
                int number = sc.nextInt();
                for (Book b : books) {
                    if (b.serial_number == number) {
                        b.display();
                        found = true;
                    }
                }
                break;

            case 2:
                System.out.print("Enter Book Name to search: ");
                String name = sc.nextLine();
                for (Book b : books) {
                    if (b.book_name.equalsIgnoreCase(name)) {
                        b.display();
                        found = true;
                    }
                }
                break;

            case 3:
                System.out.print("Enter Author Name to search: ");
                String author = sc.nextLine();
                for (Book b : books) {
                    if (b.author.equalsIgnoreCase(author)) {
                        b.display();
                        found = true;
                    }
                }
                break;

            case 4:
                System.out.print("Enter Rate to search: ");
                int rate = sc.nextInt();
                for (Book b : books) {
                    if (b.rate == rate) {
                        b.display();
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryService libService = new LibraryService();
        Book[] books = libService.AddingBooks();
        libService.displayAll(books);

        FetchBook fetch = new FetchBook();
        fetch.FetchDetails(books);
    }
}
