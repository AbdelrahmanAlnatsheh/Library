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

    static void addMagazine(String title, String number, String author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void displayMagazines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void addMagazine(Magazine newMagzine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static private int issueCounter =0;
    private int issueNumber;
    
    private Date releaseDate;

    public Magazine( Date releaseDate, String title, String author, int publicationNumber, String genre, int version, Date dateBook) {
        super(title, author, publicationNumber, genre, version, dateBook);
        this.issueNumber = issueCounter;
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
