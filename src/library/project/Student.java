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
public class Student {
    private int studentId;
    private String name;
    private String address;
    private Date birthDate;
    private String major;
    private Iterable<Student> students;
    private Object book;

    public Student(int studentId, String name, String address, Date birthDate, String major) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
        
    }
    
    
     public void borrowBooksFromLibrary(Library library) {
        for (int day = 1; day <= 5 ; day++) {
            List<Book> borrowedBooks = library.borrowBooks(3);

            if (borrowedBooks.size() >= 3) {
                borrowedBooks.addAll(borrowedBooks);
                System.out.println("Day " + day + ": " + this.name + " borrowed at least 3 books - " + borrowedBooks);
                break; 
            } else {
                System.out.println("Day " + day + ": " + this.name + " borrowed less than 3 books - " + borrowedBooks);
            }
        }
    }


  
}
