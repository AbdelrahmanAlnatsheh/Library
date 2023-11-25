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
public class Library {
    private Author auther ;
    private Books book;
    private Date data;
    private Journal jourranal;
    private Loan loan;
    private Magazine magzine;
    private Student student;

    public Library(Author auther, Books book, Date data, Journal jourranal, Loan loan, Magazine magzine, Student student) {
        this.auther = auther;
        this.book = book;
        this.data = data;
        this.jourranal = jourranal;
        this.loan = loan;
        this.magzine = magzine;
        this.student = student;
    }

    public Author getAuther() {
        return auther;
    }

    public void setAuther(Author auther) {
        this.auther = auther;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
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
    
    
    
    
    
    
}
