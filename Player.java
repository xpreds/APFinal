import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Player extends JPanel{
  double money;
  double value = 0;
  Evaluator eval = null;
  Random rand = null;
  String name = "";
  String round = "";
  boolean isAI;
  boolean folded;  // Default value false
  
  ArrayList<Integer> hand = new ArrayList<Integer>(7);
  ArrayList<Integer> table = null;
  // Constructor for Human players
  public Player(String n, double m, Evaluator e, Random r, ArrayList<Integer> t) {
    money = m;
    eval = e;
    name = n;
    table = t;
    isAI = false;
  }
  
  // Constructor for AI players
  public void Player(Evaluator e, ArrayList<Integer> t) {
    eval = e;
    rand = r;
    table = t;
    isAI = true;
  }
  
  /*public void paintComponent(Graphics g) {
    
  }*/
  
  public void addMoney(double m) {
    money = money + m;
  }
  
  // Used for resetting the value of the player at the beginng of each round
  public void setValue(double v) {
    value = v;
  }
  
  public double getValue() {
    return value;
  }
  
  public void selectAction(int raiselimit, double bet) {
    bet = bet;
    if(isAI) {
      // If has anything matching call or raise
      if(eval.evaluate(hand) > 0) {
        if(rand.nextInt(2) == 1 && raiselimit > 0) {
          raise();
        } else {
          call();
        }
      } else {
        // Cannot fold early game
        if(round.equals("Preflop") || round.equals("Flop")) {
          if(rand.nextInt(2) == 1) {
            raise();
          } else {
            call();
          }
        } else {
          // 1/3 Chance to fold
          switch(rand.nextInt(31)) {
            case <= 10: fold(); break;
            case <= 20: call(); break;
            case <= 30: raise(); break;
          }
        }
      }
    } else {
      System.out.println("Current bet is " + bet);
      System.out.println("SelectAction: raise, call, fold");
      String selection = scan.nextLine();
      if(selection.equals("raise")) {
        if(raiselimit > 0) {
          raise();
        } else {
          System.out.println("Raise limit reached. Please call or fold.");
          if(scan.nextLine().equals("call")) {
            call();
          } else {
            fold();
          }
        }
      } else if(selection.equals("call")) {
        call();
      } else {
        fold();
      }
    }
  }
  
  public int getCard(int c) {
    return hand.get(c);
  }
  
  public void takeCard(int i) {
    hand.add(i);
  }
  
  public void resetHand() {
    hand.clear();
  }
  
  public void learnRound(String r) {
    round = r;
  }
  
  public void fold() {}
  public void call() {}
  public void raise() {}
}