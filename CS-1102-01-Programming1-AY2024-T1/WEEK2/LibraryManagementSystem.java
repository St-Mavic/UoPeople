package WEEK2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {
    // a map to store information of a book.
    private static Map<String, Book> libraryBooks = new HashMap<>();
    // to accept input from a user.
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {

            // display menu
            System.out.println("\nWelcome to Library Management System");
            System.out.println("---------------------------------------");
            System.out.println("\n1: Add Book(s)");
            System.out.println("\n2: Borrow Book(s)");
            System.out.println("\n3: Return Book(s)");
            System.out.println("\n4: Exit");
            System.out.println("\n Enter your Choice");

            try { // to handle invalid input from user

                choice = input.nextInt();

                input.nextLine();

                switch (choice) {
                    case 1:
                        addBooks();
                        break;
                    case 2:
                        borrowBooks();
                        break;
                    case 3:
                        returnBooks();
                        break;
                    case 4:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. \nPlease Enter a valid option between 1 and 4.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid Input! Please enter an integer value.");// display error message
                input.nextLine();
            }

        }

    }

    public static void addBooks() {
        System.out.println("Enter the book title");
        String title = input.nextLine().toUpperCase();
        System.out.println("Enter the book author's name");
        String authorName = input.nextLine();
        System.out.println("Enter the number of books to be added");
        int numOfBooks;
        while (true) {
            try {
                numOfBooks = input.nextInt();

                if (numOfBooks > 0) {
                    break;
                } else {
                    System.out.println("Quantity of books cannot be negative or 0");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please input a valid quantity");
                input.nextLine();
            }
        }

        Book book = libraryBooks.get(title);

        if (book == null) {  //ADDING BOOK TO LIBRARY OF NOT AVAILABLE
            libraryBooks.put(title, new Book(title, authorName, numOfBooks));
            System.out.println(numOfBooks+" Book(s) added successfully.");
        } else {  //IF BOOK  IS AVAILABLE, UPDATE THE QUANTITY.
            book.setQuantity(book.getQuantity() + numOfBooks);
            System.out.println("Book quantity updated successfully");
        }
    }

    public static void borrowBooks() {
        System.out.println("Enter the book title you want to borrow");
        String title = input.nextLine().toUpperCase();

        Book book = libraryBooks.get(title);

        if (book != null) {
            System.out.println("Enter the quantity of books you want to borrow.");
            while (true) {

                try {
                    int numOfBooksTOBorrow = input.nextInt();

                    if (numOfBooksTOBorrow > 0 && numOfBooksTOBorrow <= book.getQuantity()) {
                        book.setQuantity(book.getQuantity() - numOfBooksTOBorrow);
                        System.out.println(numOfBooksTOBorrow + " Book(s) borrowed successfully");
                        break;
                    } else {
                        System.out.println("Insufficient quantity. You don't have enough books in THE LIBRARY COLLECTION!");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please input a valid quantity");
                    input.nextLine();
                }
            }
        } else {
            System.out.println("The requested book is not available in the library collection.");
        }
    }

    public static void returnBooks() {
        System.out.println("Enter the book title you want to return:");

        String title = input.nextLine().toUpperCase();

        Book book = libraryBooks.get(title);

        if (book != null) {
            System.out.println("Enter the number of books to return");
            int returnQuantity;
            while (true) {
                try{
                returnQuantity = input.nextInt();

                if (returnQuantity > 0) {
                    book.setQuantity(book.getQuantity() + returnQuantity);
                    System.out.println(returnQuantity+" Book(s) returned successfully");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid quantity.");
                }
            }catch(java.util.InputMismatchException e){
                System.out.println("Invalid input. Please input a valid quantity");
                input.nextLine();
            }
            }
        } else {
            System.out.println("Book not found in the library system.");
        }
    }

}

/**
 * Book
 */
class Book {

    private String title;
    private String author;
    private int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}