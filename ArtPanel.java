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
    for (int j = 0; j < getHeight(); j++) {
        for (int i = 0; i < getWidth(); i++) {
            double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
            double y = ((((double) j) / getHeight()) * 2.0) - 1.0;
    
            double red   = rgbExpr[0].evaluate(x, y);
            double green = rgbExpr[1].evaluate(x, y);
            double blue  = rgbExpr[2].evaluate(x, y);
    
            Color col = new Color(makeColor(red), makeColor(green),makeColor(blue));
            g.setColor(col);
            g.fillRect(i, j, 1, 1);
        }
    }
}
 
 //To make the color in the rank between to 0-255
 public int makeColor(double num){
      num += 1.0;
      if (num < 0) {
          num *= -1;
        }
        num /= 2.0;
        int color = (int) (num * 255);
        if (color >= 255) {
            color = 255;
        }
        return color;
    }
}

