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
  private JPanel panelEast;
  private JPanel panelSouth;
  private JPanel panelCen;
  private JTextField redText, greenText, blueText;
  private JButton randomButton;
  private JButton functionButton;
  private ImageIcon randomIcon;
  private ImageIcon functionIcon;
  public GUIart(){
   setLayout(new BorderLayout());
   
   panel       = new ArtPanel(450,450);
   panelEast    = new JPanel();
   panelSouth  = new JPanel();
   
   panelEast();
   panelSouth();
   
   add(panel,BorderLayout.CENTER);
   add(panelEast,BorderLayout.EAST);
   add(panelSouth,BorderLayout.SOUTH);
  }
  
  
  public void panelEast(){
   panelEast.setLayout(new GridLayout(3,0));
   panelEast.setBorder(new TitledBorder("Show the RGB's function :"));
   panelEast.setBackground(Color.white);
   redText =  makeTextField();
   greenText =  makeTextField();
   blueText =  makeTextField();
   panelEast.add(redText);
   panelEast.add(greenText);
   panelEast.add(blueText);
}
    
  public void panelSouth(){
   panelSouth.setLayout(new GridLayout(0,2));
   panelSouth.setBorder(new TitledBorder("Random Button :"));
   panelSouth.setBackground(Color.white);
   panelSouth.add(randomButton());
   panelSouth.add(functionButton());
}
    
  
  //To create the random Button
  public JButton randomButton(){
    ImageIcon randomIcon =  new ImageIcon("picture/pic1.jpg");
    randomButton = new JButton(randomIcon);
    randomButton.setBackground(Color.white);
    randomButton.setSize(new Dimension(200, 50));
    //randomButton.setText("Random");
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
        ImageIcon functionIcon =  new ImageIcon("picture/pic2.jpg");
        functionButton = new JButton(functionIcon);
        functionButton.setBackground(Color.white);
        functionButton.setSize(new Dimension(200,50));
        //functionButton.setText("Function");
        functionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("red   =" + redText.getText());
                System.out.println("green =" + greenText.getText());
                System.out.println("blue  =" + blueText.getText());
                System.out.println("__________________________________________________________________________________________");
            }
        });
        add(functionButton);
        toRandom();
        return functionButton;
    }
  
  
    public JTextField makeTextField(){
        JTextField textField = new JTextField();
        textField.setSize(new Dimension(40, 20));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        return textField;
      }

  public void toRandom(){
    CreateNode red = new BuilderTree().buildTree();
    panel.rgbString(0, red);
    CreateNode green = new BuilderTree().buildTree();
    panel.rgbString(1, green);
    CreateNode blue = new BuilderTree().buildTree();
    panel.rgbString(2, blue);
    redText.setText(red.stringFunction());
    greenText.setText(green.stringFunction());
    blueText.setText(blue.stringFunction());
  }
  
}



