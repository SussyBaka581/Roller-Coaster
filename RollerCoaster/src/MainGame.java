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
                hole1.setBounds(300, 300, 200, 200);

                JButton hole2 = new JButton();
                hole2.setIcon(icon);
                hole2.setBorder(BorderFactory.createEmptyBorder());
                hole2.setBounds(500, 300, 200, 200);

                frame.add(hole1);
                frame.add(hole2);

                frame.repaint();
        }

        private void handleButton(ActionEvent event) { //closes program when close button is pressed
                System.exit(0);
        }
 }
