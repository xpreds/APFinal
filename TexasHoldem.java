public class TexasHoldem {
  Deck deck = new Deck();
  Hand table = new Hand();
  int raisecounter = 0;
  ArrayList<Player> playersinit = new ArrayList<Player>();
  double small;
  double big;
  Evaluator evaluator = new Evaluator();
  public static void main(String[] args) {
    
  }
  
  public void Poker() {
    // The Preflop
    Preflop();
    //The Flop
    Flop();
    //The Turn
    Turn();
    //The River
    River();
    //The Showdown
    Showdown();
   
  }
  
  public void Preflop() {
    
  }
  
  public void Flop() {
    
  }
  
  public void Turn() {
    
  }
  
  public void River() {
    
  }
  
  public void Showdown() {
    
  }
}