import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class EndScreen extends MainGameTest{
    
    private JFrame endFrame;
    private JLabel finalScore;

    public EndScreen(){
        endFrame = new JFrame();

        endFrame = new JFrame("Whack an Ethan");
        endFrame.setExtendedState(endFrame.MAXIMIZED_BOTH);
        endFrame.setUndecorated(true);
        endFrame.getContentPane().setBackground(Color.CYAN);
        endFrame.setVisible(true);

        // creating and adding properties to new game button
        JButton game = new JButton("NEW GAME", null);
        game.addActionListener(event -> this.handleButton(event));
        game.setBorder(BorderFactory.createEmptyBorder());
        game.setBounds(50, 200, 100, 50);
        game.setBackground(Color.GREEN);
        endFrame.add(game);

        // finalScore = new JLabel();
        // finalScore.setBounds(50, 50, 300, 300);
        // finalScore.setText(getScore);
        // endFrame.add(finalScore);

        //TODO: fix scoreLabel so it actually displays the final score and not 0

        endFrame.add(scoreLabel);

        JButton garb = new JButton();
        garb.setBounds(500, 930, 100, 50);
        endFrame.add(garb);
        garb.setVisible(false);
        
    }
    private void handleButton(ActionEvent event) {
        MainGameTest game = new MainGameTest();
            endFrame.setVisible(false);
    }
}
