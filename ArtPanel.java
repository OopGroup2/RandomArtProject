import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

class ArtPanel extends JPanel {
 private CreateNode[] rgbExpr;
 
 public ArtPanel(int width, int height) {
  rgbExpr = new  CreateNode[3];
 }
 
 //To set color,red,green,blue in the function.
 public void setRGBExpr(int rgb, CreateNode expr) {
  
 }
 
 //To paint the color
 public void paintColor(Graphics g) {
 }
 
 //To make the color in the rank between to 0-255
 public int makeColor(double num){
  
  return 0;
 }
}

