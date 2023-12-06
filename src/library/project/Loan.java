/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.project;

/**
 *
 * @author lenevo
 */
public class Loan {
    private Student student;
    private Book book;
    private Date dueDate;
    

   
  
    
    public Loan(Student student, Book book, Date dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;
    }

    Loan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    
    public boolean  inLoan(){
        return true;
        
    }

    public String getInfo() {
        return "Loan{" + "student=" + student + ", book=" + book + ", dueDate=" + dueDate + '}';
    }
    
    
}
