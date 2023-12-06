/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.project;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenevo
 */
public class LibraryProject {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       

        // TODO code application logic here
        Library library=new library();
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("Library Registration System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Search Books by Title");
            System.out.println("4. Search Books by No");
            System.out.println("5. Search Books by Author");
            System.out.println("6. Check Book Loans");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    displayBooks(library.searchBooksByTitle(title));
                    break;
                case 4:
                    System.out.print("Enter book number: ");
                    String no = scanner.nextLine();
                    displayBooks(library.searchBooksByNo(choice));
                    break;
                case 5:
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    displayBooks(library.searchBooksByAuthor(authorName));
                    break;
                case 6:
                    displayLoans(library.checkBookLoans());
                    break;
                case 0:
                    System.out.println("Exiting the Library Registration System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("Books found:");
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
        }
    }

    private static void displayLoans(List<Loan> loans) {
        if (loans.isEmpty()) {
            System.out.println("No book loans found.");
        } else {
            System.out.println("Book loans found:");
            for (Loan loan : loans) {
              
            }
        }
    }
}
