/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenevo
 */
public class Library {
    private Author auther ;
    private Book book;
    private Date data;
    private Journal jourranal;
    private Loan loan;
    private Magazine magzine;
    private Student student;
    
    private List<Book> books;
    private List<Student> students;

   public Library(Author auther, Book book, Date data, Journal jourranal, Loan loan, Magazine magzine, Student student) {
        this.auther = auther;
        this.book = book;
        this.data = data;
        this.jourranal = jourranal;
        this.loan = loan;
        this.magzine = magzine;
        this.student = student;
         

        
    }

    Library() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
    public Author getAuther() {
        return auther;
    }

    public void setAuther(Author auther) {
        this.auther = auther;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Journal getJourranal() {
        return jourranal;
    }

    public void setJourranal(Journal jourranal) {
        this.jourranal = jourranal;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Magazine getMagzine() {
        return magzine;
    }

    public void setMagzine(Magazine magzine) {
        this.magzine = magzine;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
  
    public List<Book> searchBooksByTitle(String title) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) { 
            result.add(book);
        }
    }
    return result;
}
    public List<Book> searchBooksByNo(int  no) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationNumber()== no) {
                result.add(book);
            }
        }
        return result;
    }
    
    
    public List<Book> searchBooksByAuthor(String authorName) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
        if (book.getAuthor().equalsIgnoreCase(getAuther().getName())) {
            result.add(book);
        }
    }
    return result;
}
   

      
     public List<Loan> checkBookLoans(Book book) {
        List<Loan> result = new ArrayList<>();
        for (Student student : students) {
            for (Book borrowedBook : student.getBookLoans() ) {
                if (borrowedBook.equals(book)) {
                    Loan loan = new Loan(student, book, data);
                    loan.setStudent(student);
                    loan.setBook(book);    
                    result.add(loan);
                   
                }
            }
        }
        return result;
    }
      

      
       public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    List<Book> borrowBooks(int numberOfBooks) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    List<Loan> checkBookLoans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
