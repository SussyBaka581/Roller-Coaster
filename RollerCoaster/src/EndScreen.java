import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class EndScreen{
    
    private JFrame endFrame;
    private JLabel finalScore;

    public EndScreen(JFrame sourceFrame){
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

        //TODO: fix scoreLabel so it actually displays the final score and not 0

        //endFrame.add(scoreLabel);

        // JButton garb = new JButton();
        // garb.setBounds(500, 930, 100, 50);
        // endFrame.add(garb);
        // garb.setVisible(false);
        
    }
    private void handleButton(ActionEvent event) {
        MainGameTest game = new MainGameTest();
            endFrame.setVisible(false);

    }
    private void handleButton2(ActionEvent event) {
        System.exit(0);
    }

}
