/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flyhi
 */
public class Books {
    private String bookName;
    private int pages;
    private int publicationYear;
    
    public Books(String title, int pages, int publicationYear) {
        this.bookName = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return this.bookName;
    }
    public int getPage() {
        return this.pages;
        
    } 
    public int getPub() {
        return this.publicationYear;
    }
    
    public String toString() {
        return this.bookName + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
