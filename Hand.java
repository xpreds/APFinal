//Ali Kaan Durany?ld?z

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Double;

public class Hand {
 int[] hand = new int[6];
 Deck deck = new Deck();
 ArrayList<Double> selected = new ArrayList<Double>();
 
 public Hand() {
  for(int i = 1; i <= 5; i++) {
   hand[i] = deck.deck[i];
  }
 }
 
 public void displayHand() {
  System.out.println(deck.getName(hand[1]) +  "\t" 
       + deck.getName(hand[2]) + "\t"
       + deck.getName(hand[3]) + "\t"
       + deck.getName(hand[4]) + "\t"
       + deck.getName(hand[5]) + "\t");
 }
 
 public void askForChange(ArrayList<Double> s) {
   selected = s;
  //Scanner scan = new Scanner(System.in);
  //System.out.print("How many cards would you like to repick?  ");
  int nchange = selected.size();//scan.nextInt();
  
  for(int i = 1; i <= nchange; i++) {
   //System.out.println();
   //System.out.print("Which card? 1-5  ");
   int n = selected.get(i-1).intValue();
   hand[n] = deck.deck[5+i];
  }
  //scan.close();
  System.out.println();
  //System.out.println("Your new Hand: ");
  //displayHand();
 }

}
