import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGame {
        
        //create frame method
        private JFrame frame;
        
        public MainGame(){
                
                //setting frame sizing parameters
                frame = new JFrame("Whack an Ethan");
                frame.setExtendedState(frame.MAXIMIZED_BOTH);
                frame.setUndecorated(true);
                frame.getContentPane().setBackground(Color.CYAN);
                frame.setVisible(true);

                //creating and adding properties to close button
                JButton exit = new JButton("CLOSE", null);
                exit.addActionListener(event -> this.handleButton(event));
                exit.setBorder(BorderFactory.createEmptyBorder());
                exit.setBounds(50, 930, 100, 50);
                exit.setBackground(Color.RED);
                frame.add(exit);

                /*adds picture as asset to game*/ImageIcon icon = new ImageIcon("RollerCoaster/src/GameAsset2.png");
                
                //code for buttons 1-6
                JButton hole1 = new JButton();
                hole1.setIcon(icon);
                hole1.setBorder(BorderFactory.createEmptyBorder());
                hole1.setBounds(500, 300, 200, 200);
                hole1.setBackground(Color.BLACK);

                JButton hole2 = new JButton();
                hole2.setIcon(icon);
                hole2.setBorder(BorderFactory.createEmptyBorder());
                hole2.setBounds(750, 300, 200, 200);
                hole2.setBackground(Color.BLACK);
                
                JButton hole3 = new JButton();
                hole3.setIcon(icon);
                hole3.setBorder(BorderFactory.createEmptyBorder());
                hole3.setBounds(1000, 300, 200, 200);
                hole3.setBackground(Color.BLACK);

                JButton hole4 = new JButton();
                hole4.setIcon(icon);
                hole4.setBorder(BorderFactory.createEmptyBorder());
                hole4.setBounds(500, 550, 200, 200);
                hole4.setBackground(Color.BLACK);

                JButton hole5 = new JButton();
                hole5.setIcon(icon);
                hole5.setBorder(BorderFactory.createEmptyBorder());
                hole5.setBounds(750, 550, 200, 200);
                hole5.setBackground(Color.BLACK);

                JButton hole6 = new JButton();
                hole6.setIcon(icon);
                hole6.setBorder(BorderFactory.createEmptyBorder());
                hole6.setBounds(1000, 550, 200, 200);
                hole6.setBackground(Color.BLACK);

                frame.add(hole1);
                frame.add(hole2);
                frame.add(hole3);
                frame.add(hole4);
                frame.add(hole5);
                frame.add(hole6);

                frame.repaint();
        }

        private void handleButton(ActionEvent event) { //closes program when close button is pressed
                System.exit(0);
        }
 }
