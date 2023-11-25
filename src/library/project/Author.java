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
public class Author {
    private int authorId;
    private String name;
    private String address;
    private Date birthDate;

    public Author(int authorId, String name, String address, Date birthDate) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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

    
    public String getInfo() {
        return "Auther{" + "authorId=" + authorId + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate + '}';
    }
    
    
}
