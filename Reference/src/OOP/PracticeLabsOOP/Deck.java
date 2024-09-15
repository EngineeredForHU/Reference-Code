package OOP.PracticeLabsOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> newDeck = new ArrayList<Card>();

    //constructor
    public Deck() {
        //instantiated cards with suits and numbers
       String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
       String[] numbers = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

       for (String suit : suits) {
           int count = 2;
           for (String numberName : numbers) {
               Card card1 = new Card(numberName, suit, count);
               this.newDeck.add(card1);
               count++;
           }
       }
   }


   public void deckDescribe(){
       for (Card card: this.newDeck){
           card.cardDescribe();
       }
   }

   public void deckShuffle(){
     Collections.shuffle(this.newDeck);
   }

   public Card draw(){
        //removes the top card
        Card card1 = this.newDeck.remove(0);
        return card1;
   }


    public List<Card> getCards() {
        return newDeck;
    }

    public void setCards(List<Card> cards) {
        this.newDeck = cards;
    }
}
