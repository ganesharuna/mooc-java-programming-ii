/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Book implements Packable {
    private String name;
    private String author;
    private double weight;
    
    public Book(String author, String name, double size){
        this.author=author;
        this.name=name;
        this.weight=size;
                
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.author+": "+ this.name;
    }
    
    
}
