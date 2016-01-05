import java.util.Scanner;

public class TexasHoldem {
  public static void main(String[] args) {
    
  }
  
  public void Poker() {
    Scanner scan = new Scanner(System.in);
    Deck deck = new Deck();
    Hand table = new Hand();
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    
    System.out.print("How many rivals? ");
    int playercount = scan.nextInt();
    ArrayList<Player> playerlist = new ArrayList<Player>(playercount);
    for(int i = 0; i < playercount; i++) {
      playerlist.add(new Player(table));
    }
    
    Player human = new Player();
    System.out.println("How much money do you have? ");
    human.addMoney(scan.nextDouble());
    playerlist.add(generator.nextInt(0, playercount), human);
    playerlist.add(new Player(table));
    double big = human.getBalance()/100;
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setBlind(big);
    }
    
    boolean everyoneact;
    boolean everyonesame;
    
    // The Preflop
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    int raisecounter = 0;    // Set counter for raise to zero
    double bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).giveCard(deck.getCard());
      playerlist.get(i).giveCard(deck.getCard());
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).setValue(small);
    playerlist.get(2).setValue(big);
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(playerlit.get(i) = human) {
          System.out.println("Current bet: " + bet);
          System.out.println("Call, raise or fold? ");
          playerlist.get(i).selectAction(scan.nextLine());
        } else {
          playerlist.get(i).selectAction();
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          raisecounter++;
        }
      }
      everyoneacted = true;    // After this for loop every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(pre < 0) {
          pre = playercount;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
        } else {
          everyonesame = false;
          break;
        }
      }
    }
    // The Flop
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    raisecounter = 0;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).stValue(small);
    playerlist.get(2).setValue(big);
    
    table.giveCard(deck.getCard());
    table.giveCard(deck.getCard());
    table.giveCard(deck.getCard());
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(playerlit.get(i) = human) {
          System.out.println("Curent bet: " + bet);
          System.out.println("Call, raise or fold? ");
          playerlist.get(i).selectAction(scan.nextLine());
        } else {
          playerlist.get(i).selectAction();
        }
        if(playerlist.get(i).getValue() < 0 ) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          raisecounter++;
        }
      }
      everyoneacted = true;    // At this point every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(pre < 0) {
          pre = playercount;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
        } else {
          everyonesame = false;
          break;
        }
      }
    }
    // The Turn
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    raisecounter = 0;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).stValue(small);
    playerlist.get(2).setValue(big);
    
    table.giveCard(deck.getCard());
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(playerlit.get(i) = human) {
          System.out.println("Curent bet: " + bet);
          System.out.println("Call, raise or fold? ");
          playerlist.get(i).selectAction(scan.nextLine());
        } else {
          playerlist.get(i).selectAction();
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          raisecounter++;
        }
      }
      everyoneacted = true;    // At this point every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(pre < 0) {
          pre = playercount;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
        } else {
          everyonesame = false;
          break;
        }
      }
    }
    // The River
    everyoneact = false;    // Set the round passing conditions to false
    everyonesame = false;    // Set the round passing conditions to false
    raisecounter = 0;    // Set counter for raise to zero
    bet = big;    // Set bet value to the highest amount
    for(int i = 0; i < playercount; i++) {
      playerlist.get(i).setValue(0);
    }
    playerlist.get(1).stValue(small);
    playerlist.get(2).setValue(big);
    
    table.giveCard(deck.getCard());
    
    while(!(everyoneact && everyonesame)) {
      for(int i  = 0; i < playercount; i++) {
        if(playerlit.get(i) = human) {
          System.out.println("Curent bet: " + bet);
          System.out.println("Call, raise or fold? ");
          playerlist.get(i).selectAction(scan.nextLine());
        } else {
          playerlist.get(i).selectAction();
        }
        if(playerlist.get(i).getValue() < 0) {
          playerlist.get(i).setValue(0);
        }
        if(playerlist.get(i).getValue() > bet) {
          raisecounter++;
        }
      }
      everyoneacted = true;    // At this point every player had a chance to act
      for(int i = 0; i < playercount; i++) {
        int pre = i-1;
        if(pre < 0) {
          pre = playercount;
        }
        if(playerlist.get(i).getValue() == playerlist.get(pre).getValue()) {
          everyonesame = true;
        } else {
          everyonesame = false;
          break;
        }
      }
    }
    // The Showdown
    
    
   
  }
  
  
}
