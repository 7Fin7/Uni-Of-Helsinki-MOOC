/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fin
 */
public class Book {
    private String title;
    private int numPages;
    private int pubYear;
    
    public Book(String title, int numPages, int pubYear) {
        this.title = title;
        this.numPages = numPages;
        this.pubYear = pubYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.numPages + " pages, " + this.pubYear; 
    }
}
