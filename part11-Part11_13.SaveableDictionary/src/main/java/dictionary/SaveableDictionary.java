/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private String file;
    
    public SaveableDictionary(String file){
        this.dictionary=new HashMap<>();
        this.file=file;
    }
    public boolean load(){
        try (Scanner scanner=new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String words[]=scanner.nextLine().split(":");
                this.dictionary.putIfAbsent(words[0],words[1]);
                this.dictionary.putIfAbsent(words[1], words[0]);
            }
                return true;
            }catch(Exception e){
                return false;
        }
    }
    
    public boolean save(){
        ArrayList<String> usedWords = new ArrayList<>();
        try {
            FileWriter dict = new FileWriter(this.file);
            for (String key: this.dictionary.keySet()) {
                String translatedWord = this.dictionary.get(key);
                usedWords.add(translatedWord);
                if (!(usedWords.contains(key))) {
                    dict.write(key + ":" + this.dictionary.get(key) + "\n");     
              } 
            }
            dict.close();
            return true;
        } catch (Exception e) {
            return false;
        }   
    }
    
        
    
    public SaveableDictionary(){
        this.dictionary=new HashMap<>();
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.put(translation, words);
    }
    
    public String translate(String word){
        return this.dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word){
        if (dictionary.containsKey(word)){
        String translation=this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
        }
    }
}
