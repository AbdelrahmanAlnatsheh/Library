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
public class Magazine extends Book{
    private int issueNumber;
    private Date releaseDate;

    public Magazine(int issueNumber, Date releaseDate, String title, String author, int publicationNumber, String genre, int version, Date dateBook) {
        super(title, author, publicationNumber, genre, version, dateBook);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    
    public String getinfo() {
        return "Magazine{" + "issueNumber=" + issueNumber + ", releaseDate=" + releaseDate + '}';
    }
    
   
    
}
