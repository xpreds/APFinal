import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Toolkit;

public class TableComponent extends JComponent {
  Image image;
  final int width = 73;  // Width of one card
  final int height = 98;  // Height of one card
  int xPos;
  int yPos;
  int[] ii = new int[6];
  int[] j = new int[6];
  Player human = null;
  ArrayList<Integer> table = null;
  
  
  
  
  public TableComponent(Player p) {
    image = Toolkit.getDefaultToolkit().getImage("poker.png");
    xPos = 100;
    yPos = 100;
    human = p;
    
  }
  
  public TableComponent(ArrayList<Integer> t) {
    image = Toolkit.getDefaultToolkit().getImage("poker.png");
    xPos = 100;
    yPos = 100;
    table = t;
  }
  public void paintComponent(Graphics g) {
    if(table == null) {
      for(int i = 1; i <= 1; i++) {
        ii[i] = ((human.getCard(i)-1) / 13);//suit
        j[i] = (human.getCard(i)-1) % 13;//value
      }
    } else {
      for(int i = 1; i <= 2; i++) {
        ii[i] = ((table.get(i-1)-1) / 13);//suit
        j[i] = (table.get(i-1)-1) % 13;//value
      }
    }
    
    g.drawImage(image, xPos , yPos , xPos+width, yPos+height, j[1]*width , ii[1]*height, j[1]*width + width, ii[1]*height + height, null);
    g.drawImage(image, xPos+85 , yPos , xPos+85+width, yPos+height, j[2]*width , ii[2]*height, j[2]*width + width, ii[2]*height + height, null);
    g.drawImage(image, xPos+170 , yPos , xPos+170+width, yPos+height, j[3]*width , ii[3]*height, j[3]*width + width, ii[3]*height + height, null);
    repaint();
  }
}