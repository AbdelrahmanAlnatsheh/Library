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
public class Journal extends Books{
     private String conferenceName;
    private int conferenceNumber;

    public Journal(String conferenceName, int conferenceNumber, String title, String author, int publicationNumber, String genre, int version, Date dateBook) {
        super(title, author, publicationNumber, genre, version, dateBook);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }

    public void setConferenceNumber(int conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }

    @Override
    public String getInfo() {
        return "Journal{" + "conferenceName=" + conferenceName + ", conferenceNumber=" + conferenceNumber + '}';
    }
    
    
    
}
