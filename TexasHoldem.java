import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.BorderLayout;


public class TexasHoldem {
  public static void main(String[] args) {
    Poker();
  }
  
  public static void Poker() {
    Scanner scan = new Scanner(System.in);
    Deck deck = new Deck();
    Evaluator evaluator = new Evaluator();
    ArrayList<Integer> table = new ArrayList<Integer>();  // Create the table as a hand or Player object, so that it holds cards and you can add cards to it.
    Random generator = new Random();
    
    System.out.print("How many rivals? ");
    int playercount = scan.nextInt();
    ArrayList<Player> playerlist = new ArrayList<Player>(playercount);
    for(int i = 0; i < playercount; i++) {
      playerlist.add(new Player(evaluator, table, generator));
    }
    
    Player human = new Player(JOptionPane.showInputDialog("What is your name? "), 1000, evaluator, generator, table);
    System.out.println("How much money do you have? ");
    human.addMoney(scan.nextDouble());
    playerlist.add(generator.nextInt(playercount), human);
    playerlist.add(new Player(evaluator, table, generator));
    double big = human.getBalance()/100;
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setBlind(big);
    }
    
    boolean everyoneact;
    boolean everyonesame;
    
    // Create the frame
    
    
    
    
    
    
    // The Preflop
    System.out.println("Welcome to the Preflop round!");
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    
    int raisecounter = 3;    // Set counter for raise to zero
    double bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).takeCard(deck.getCard());
      playerlist.get(i).takeCard(deck.getCard());
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).setValue(big);
    playerlist.get(2).setValue(big);
    
    /*while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(!(playerlist.get(i).getName().equals("AI"))) {
          System.out.println("Your cards: " + deck.getName(playerlist.get(i).getCard(0)) + "\t" + deck.getName(playerlist.get(i).getCard(1)));
          playerlist.get(i).selectAction(raisecounter, bet);
        } else {
          playerlist.get(i).selectAction(raisecounter, bet);
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          bet = playerlist.get(i).getValue();
          raisecounter--;
        }
      }
      everyoneact = true;    // After this for loop every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(i == playercount) {
          i = 0;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
          System.out.println("Everyone same changing round");
        } else {
          everyonesame = false;
          System.out.println("Not same");
          break;
        }
      }
    }*/
    
    
    // The Flop
    System.out.println("Welcome to the Flop round!");
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    
    raisecounter = 3;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).setValue(big);
    playerlist.get(2).setValue(big);
    
    table.add(deck.getCard()); // Add three cards to the table
    table.add(deck.getCard());
    table.add(deck.getCard());
    
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(!(playerlist.get(i).getName().equals("AI"))) {
          System.out.println("Your cards: " + deck.getName(playerlist.get(i).getCard(0)) + "\t" + deck.getName(playerlist.get(i).getCard(1)));
          System.out.println("Cards on the table: " + deck.getName(table.get(0)) + deck.getName(table.get(1)) + deck.getName(table.get(2)));
          playerlist.get(i).selectAction(raisecounter, bet);
        } else {
          playerlist.get(i).selectAction(raisecounter, bet);
        }
        if(playerlist.get(i).getValue() < 0 ) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          bet = playerlist.get(i).getValue();
          raisecounter--;
        }
      }
      everyoneact = true;    // At this point every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(i == playercount) {
          i = 0;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
          System.out.println("Everyone same changing round");
        } else {
          everyonesame = false;
          System.out.println("Not same");
          break;
        }
      }
    }
    
    
    // The Turn
    System.out.println("Welcome to the Turn round!");
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    raisecounter = 3;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).setValue(big);
    playerlist.get(2).setValue(big);
    
    table.add(deck.getCard());  // Add one card to the table
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(!(playerlist.get(i).getName().equals("AI"))) {
          System.out.println("Your cards: " + deck.getName(playerlist.get(i).getCard(0)) + "\t" + deck.getName(playerlist.get(i).getCard(1)));
          playerlist.get(i).selectAction(raisecounter, bet);
        } else {
          playerlist.get(i).selectAction(raisecounter, bet);
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          bet = playerlist.get(i).getValue();
          raisecounter--;
        }
      }
      everyoneact = true;    // At this point every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(i == playercount) {
          i = 0;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
          System.out.println("Everyone same changing round");
        } else {
          everyonesame = false;
          System.out.println("Not same");
          break;
        }
      }
    }
    
    
    // The River
    System.out.println("Welcome to the river round");
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    raisecounter = 3;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).setValue(big);
    playerlist.get(2).setValue(big);
    
    table.add(deck.getCard());  // Add one card to the table
    
    
    
    
    // The Showdown
    
    
   
  }
  
  public void preFlop() {}
  public void flop() {}
  public void turn() {}
  public void river() {
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(!(playerlist.get(i).getName().equals("AI"))) {
          System.out.println("Your cards: " + deck.getName(playerlist.get(i).getCard(0)) + "\t" + deck.getName(playerlist.get(i).getCard(1)));
          playerlist.get(i).selectAction(raisecounter, bet);
        } else {
          System.out.println("AI playing");
          playerlist.get(i).selectAction(raisecounter, bet);
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          bet = playerlist.get(i).getValue();
          raisecounter--;
        }
      }
      everyoneact = true;    // At this point every player had a chance to act
      for(int i = 1; i <= playercount; i++) {
        int pre = i-1;
        if(i == playercount) {
          i = 0;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
          System.out.println("Everyone same changing round");
        } else {
          everyonesame = false;
          System.out.println("Everyone not same!");
          break;
        }
      }
    }
  }
  
  public static void painter(ArrayList<Integer> t, Player h) {
    JFrame frame = new JFrame("Poker Tester");
    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    
    TableComponent table = new TableComponent(t);
    TableComponent human = new TableComponent(h);
    
    frame.getContentPane().add(table);
    frame.getContentPane().add(human, BorderLayout.SOUTH);
    frame.setVisible(true);
    
  }
  
  
}
