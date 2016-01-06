import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Player extends JPanel{
  double money;
  double value = 0;
  Evaluator eval;
  String name = "";
  boolean isAI;
  ArrayList<Integer> hand = new ArrayList<Integer>();
  public Player(String n, double balance, Evaluator e) {
    money = balance;
    eval = e;
    name = n;
    isAI = false;
  }
  
  public void Player(Evaluator e) {
    isAI = true;
  }
  
  public void paintComponent(Graphics g) {
    
  }
  
  public void addMoney(double m) {
    money = money + m;
  }
  
  public void setValue(double v) {
    value = v;
  }
  
  public double getValue() {
    return value;
  }
  
  public void selectAction() {
    boolean folded = false;
    if(isAI) {} else {}
  }
  
  public int getCard(int c) {
    return hand[c];
  }
  
  public void takeCard(int i) {}
  
  public void fold() {}
  public void call() {}
  public void raise() {}
}