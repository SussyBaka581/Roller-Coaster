import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class EndScreen{
    
    private JFrame endFrame;
    private JLabel finalScore;

    public EndScreen(JFrame sourceFrame, int x, int y){
        sourceFrame.setVisible(false);
        
        endFrame = new JFrame();

        endFrame = new JFrame("FINISHED!");
        endFrame.setExtendedState(endFrame.MAXIMIZED_BOTH);
        endFrame.setUndecorated(true);
        endFrame.getContentPane().setBackground(Color.CYAN);
        endFrame.setLayout(null);
        endFrame.setVisible(true);

        // creating and adding properties to new game button
        JButton game = new JButton("NEW GAME", null);
        game.addActionListener(event -> this.handleButton(event));
        game.setBorder(BorderFactory.createEmptyBorder());
        game.setBounds(50, 850, 100, 50);
        game.setBackground(Color.GREEN);
        endFrame.add(game);

        JButton exit = new JButton("CLOSE", null);
        exit.addActionListener(event -> this.handleButton2(event));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBounds(50, 930, 100, 50);
        exit.setBackground(Color.RED);
        endFrame.add(exit);

        JLabel finalScore = new JLabel();
        finalScore.setBounds(50, 70, 600, 50);
        finalScore.setText("Your final score was " + (Integer.toString(x)));
        finalScore.setFont(new Font("Comic Sans", Font.PLAIN, 30));
        endFrame.add(finalScore);

        JLabel finalMiss = new JLabel();
        finalMiss.setBounds(50, 150, 600, 50);
        finalMiss.setText("You missed the Ethan " + (Integer.toString(y)) + " times");
        finalMiss.setFont(new Font("Comic Sans", Font.PLAIN, 30));
        finalMiss.setForeground(Color.RED);
        endFrame.add(finalMiss);
        


        //endFrame.add(scoreLabel);

        // JButton garb = new JButton();
        // garb.setBounds(500, 930, 100, 50);
        // endFrame.add(garb);
        // garb.setVisible(false);
        
    }
    private void handleButton(ActionEvent event) {
        MainGame game = new MainGame();
            endFrame.setVisible(false);

    }
    private void handleButton2(ActionEvent event) {
        System.exit(0);
    }

}
