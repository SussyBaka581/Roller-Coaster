import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StartScreen {
    
    private JFrame start;

    public StartScreen(){
        //creates frame
        
        start = new JFrame("Welcome");
        start.setSize(600, 400);
        start.getContentPane().setBackground(Color.CYAN);
        start.setLayout(null);
        start.setVisible(true);
        start.setResizable(false);

        //title

        JLabel title = new JLabel();
        title.setText("Whack an Ethan!");
        title.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        title.setBounds(145, 50, 600, 50);
        start.add(title);

        //buttons

        JButton game = new JButton("PLAY!", null);
        game.addActionListener(event -> this.handleButton(event));
        game.setBorder(BorderFactory.createEmptyBorder());
        game.setBounds(190, 300, 200, 50);
        game.setBackground(Color.GREEN);
        start.add(game);

        JButton exit = new JButton("CLOSE", null);
        exit.addActionListener(event -> this.handleButton2(event));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBounds(50, 300, 100, 50);
        exit.setBackground(Color.RED);
        start.add(exit);
    }

    //button actions

    private void handleButton(ActionEvent event) {
        MainGame game = new MainGame();
            start.setVisible(false);

    }

    private void handleButton2(ActionEvent event) {
        System.exit(0);
    }
}
