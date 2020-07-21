
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards=new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for (Card card: cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    @Override
    public int compareTo(Hand another) {
        int sum1=0;
        int sum2=0;
        for (Card card: cards){
            sum1+=card.getValue();
        }
        for (Card card: another.cards){
            sum2+=card.getValue();
        }
        return sum1-sum2;
    }
    
    public class SortBySuit implements Comparator<Card>{
        Iterator<Card> iter = cards.iterator();
            public int compare(Card c1, Card c2) {
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }
    }
    
    public void sortBySuit(){
       Collections.sort(cards, new BySuitInValueOrder()); 
    }
}
    

