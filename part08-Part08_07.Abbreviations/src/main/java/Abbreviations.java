
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Abbreviations {
        private HashMap <String, String> directory ;
    
    public Abbreviations(){
         this.directory=new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation=abbreviation.toLowerCase();
        abbreviation=abbreviation.trim();
        explanation=explanation.toLowerCase();
        explanation=explanation.trim();
        
        directory.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        abbreviation=abbreviation.toLowerCase();
        abbreviation=abbreviation.trim();
        return this.directory.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        abbreviation=abbreviation.toLowerCase();
        abbreviation=abbreviation.trim();
        return this.directory.get(abbreviation);
    }
}
