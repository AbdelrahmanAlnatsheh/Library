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
    private Books book;
    private Date dueDate;

    public Loan(Student student, Books book, Date dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
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
