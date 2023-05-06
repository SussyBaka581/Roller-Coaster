import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGameTest {

    // create frame method
    private JFrame frame;
    private int testCount = 0;
    // private boolean buttonPress;
    private int hitCounter = 0;
    private int randNum = 0;
    private JButton hole1;
    private JButton hole2;
    private JButton hole3;
    private JButton hole4;
    private JButton hole5;
    private JButton hole6;
    private JLabel me;
    private ImageIcon icon;

    private void handleButton2(ActionEvent event) {
        ethanHit();
    }

    private void handleButton3(ActionEvent event) {
        ethanHit();
    }

    private void handleButton4(ActionEvent event) {
        ethanHit();
    }

    private void handleButton5(ActionEvent event) {
        ethanHit();
    }

    private void handleButton6(ActionEvent event) {
        ethanHit();
    }

    private void handleButton7(ActionEvent event) {
        ethanHit();
    }

    private void handleButton(ActionEvent event) { // closes program when close button is pressed
        System.exit(0);
    }

    public MainGameTest() {

        // setting frame sizing parameters
        frame = new JFrame("Whack an Ethan");
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setVisible(true);

        // creating and adding properties to close button
        JButton exit = new JButton("CLOSE", null);
        exit.addActionListener(event -> this.handleButton(event));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBounds(50, 930, 100, 50);
        exit.setBackground(Color.RED);
        frame.add(exit);

        /* adds picture as asset to game */icon = new ImageIcon("RollerCoaster/src/GameAsset2.png");

        // code for buttons 1-6
        hole1 = new JButton();
        hole1.addActionListener(event -> this.handleButton2(event));
        // hole1.setIcon(icon);
        hole1.setBorder(BorderFactory.createEmptyBorder());
        hole1.setBounds(500, 300, 200, 200);
        hole1.setBackground(Color.BLACK);

        hole2 = new JButton();
        hole2.addActionListener(event -> this.handleButton3(event));
        hole2.setIcon(icon);
        hole2.setBorder(BorderFactory.createEmptyBorder());
        hole2.setBounds(750, 300, 200, 200);
        hole2.setBackground(Color.BLACK);

        hole3 = new JButton();
        hole3.addActionListener(event -> this.handleButton4(event));
        hole3.setIcon(icon);
        hole3.setBorder(BorderFactory.createEmptyBorder());
        hole3.setBounds(1000, 300, 200, 200);
        hole3.setBackground(Color.BLACK);

        hole4 = new JButton();
        hole4.addActionListener(event -> this.handleButton5(event));
        hole4.setIcon(icon);
        hole4.setBorder(BorderFactory.createEmptyBorder());
        hole4.setBounds(500, 550, 200, 200);
        hole4.setBackground(Color.BLACK);

        hole5 = new JButton();
        hole5.addActionListener(event -> this.handleButton6(event));
        hole5.setIcon(icon);
        hole5.setBorder(BorderFactory.createEmptyBorder());
        hole5.setBounds(750, 550, 200, 200);
        hole5.setBackground(Color.BLACK);

        hole6 = new JButton();
        hole6.addActionListener(event -> this.handleButton7(event));
        hole6.setIcon(icon);
        hole6.setBorder(BorderFactory.createEmptyBorder());
        hole6.setBounds(1000, 550, 200, 200);
        hole6.setBackground(Color.BLACK);

        me = new JLabel();
        me.setIcon(icon);

        frame.add(hole1);
        frame.add(hole2);
        frame.add(hole3);
        frame.add(hole4);
        frame.add(hole5);
        frame.add(hole6);

        frame.repaint();

        ethanHit();

    }

    private void ethanHit() {
        if (hitCounter < 25) {
            randNum = (int) (Math.random() * 5) + 1;
            System.out.println(randNum);
            hitCounter++;
            holeAppear1();
            holeAppear1();

        }

    }

    public void holeAppear1() {
        if (randNum == 1) {
            hole1.setIcon(icon);
            hole1.setBorder(BorderFactory.createEmptyBorder());
            hole1.setBounds(500, 300, 200, 200);
            hole1.setBackground(Color.BLACK);
            hole6.setVisible(false);
        }
    }

}
