import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;


class GUIart extends JFrame {
  
  private ArtPanel panel;
  private JPanel panelTop;
  private JPanel panelSouth;
  private JPanel panelCen;
  private JTextField redText, greenText, blueText;
  private JButton randomButton;
  private JButton functionButton;
  private ImageIcon randomIcon;
  private ImageIcon functionIcon;

  
 
  
  
  public GUIart(){
   setLayout(new BorderLayout());
   
   panel       = new ArtPanel(600,616);
   panelTop    = new JPanel();
   panelSouth  = new JPanel();
   
   panelTop();
   panelSouth();
   
   
   add(panel,BorderLayout.CENTER);
   add(panelTop,BorderLayout.NORTH);
   add(panelSouth,BorderLayout.SOUTH);
  }
  
  
  
  public void panelTop(){
   panelTop.setLayout(new GridLayout(3,0));
   redText =  makeTextField();
   greenText =  makeTextField();
   blueText =  makeTextField();
   panelTop.add(redText);
   panelTop.add(greenText);
   panelTop.add(blueText);
}
  
    
  public void panelSouth(){
   panelSouth.setLayout(new GridLayout(0,2));
   panelSouth.add(randomButton());
   panelSouth.add(functionButton());
   panelSouth.setBorder(new TitledBorder("Random Button"));
}
   
  //To create the random Button
  public JButton randomButton(){
    ImageIcon randomIcon =  new ImageIcon("picture/random.jpg");
    randomButton = new JButton(randomIcon);
    randomButton.setSize(new Dimension(200, 50));
    randomButton.setText("Random");
    randomButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        toRandom();
        repaint();
      }
    });
  return randomButton;
  }
  
    public JButton functionButton(){
        ImageIcon functionIcon =  new ImageIcon("picture/function.jpg");
        functionButton = new JButton(functionIcon);
        functionButton.setSize(new Dimension(200,50));
        functionButton.setText("Function");
        functionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("red   =" + redText.getText());
                System.out.println("green =" + greenText.getText());
                System.out.println("blue  =" + blueText.getText());
            }
        });
        add(functionButton);
        toRandom();
        return functionButton;
    }
  
  
    public JTextField makeTextField(){
        JTextField textField = new JTextField();
        textField.setSize(new Dimension(400, 20));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        return textField;
      }
      
      
  public void toRandom(){
    CreateNode red = new BuilderTree().buildTree();
    CreateNode green = new BuilderTree().buildTree();
    CreateNode blue = new BuilderTree().buildTree();
    
    panel.rgbString(0, red);
    panel.rgbString(1, green);
    panel.rgbString(2, blue);
    
    redText.setText(red.stringFunction());
    greenText.setText(green.stringFunction());
    blueText.setText(blue.stringFunction());
  }
  
 
  
  
}



