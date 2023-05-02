import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGame {

        private JFrame frame;
        
        public MainGame(){
                frame = new JFrame("Whack an Ethan");
                frame.setExtendedState(frame.MAXIMIZED_BOTH);
                frame.setUndecorated(true);
                frame.setVisible(true);

                JButton exit = new JButton("CLOSE", null);
                exit.addActionListener(event -> this.handleButton(event));
                exit.setBorder(BorderFactory.createEmptyBorder());
                exit.setBounds(50, 930, 100, 50);
                exit.setBackground(Color.RED);
                frame.add(exit);

        }

        private void handleButton(ActionEvent event) {
                System.exit(0);
        }
 }
