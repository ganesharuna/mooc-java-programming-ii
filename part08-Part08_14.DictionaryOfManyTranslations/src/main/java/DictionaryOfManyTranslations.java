
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations (){
        this.dict=new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dict.putIfAbsent(word,new ArrayList<>());
        
        this.dict.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if (!this.dict.containsKey(word)){
            return new ArrayList<>();
        }
        return (this.dict.get(word));
    }
    
    public void remove(String word){
        this.dict.remove(word);
    }
}