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
public class Books {
    private String title;
    private String author;
    private int publicationNumber;
    private String genre;
    private int version;
    private Date dateBook;

    public Books(String title, String author, int publicationNumber, String genre, int version, Date dateBook) {
        this.title = title;
        this.author = author;
        this.publicationNumber = publicationNumber;
        this.genre = genre;
        this.version = version;
        this.dateBook = dateBook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationNumber(int publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setDateBook(Date dateBook) {
        this.dateBook = dateBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public String getGenre() {
        return genre;
    }

    public int getVersion() {
        return version;
    }

    public Date getDateBook() {
        return dateBook;
    }

    
    public String getInfo() {
        return "Books{" + "title=" + title + ", author=" + author + ", publicationNumber=" + publicationNumber + ", genre=" + genre + ", version=" + version + ", dateBook=" + dateBook + '}';
    }

    
    
    
    
}
