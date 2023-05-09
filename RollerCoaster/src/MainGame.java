import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGame {

    // create frame method
    public JFrame frame;
    private int hitCounter = 0;
    private int randNum = 0;
    private JButton hole1;
    private JButton hole2;
    private JButton hole3;
    private JButton hole4;
    private JButton hole5;
    private JButton hole6;
    private ImageIcon icon;
    private boolean gameStart = false;
    public JLabel scoreLabel;
    public int scoreCount = 0;
    public String getScore;
    public JLabel misses;
    public int miss = 0;

    //button actions

    private void handleButton2(ActionEvent event) {
        if (gameStart == true && randNum == 1) {
            hole1.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton3(ActionEvent event) {
        if (gameStart == true && randNum == 2) {
            hole2.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton4(ActionEvent event) {
        if (gameStart == true && randNum == 3) {
            hole3.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton5(ActionEvent event) {
        if (gameStart == true && randNum == 4) {
            hole4.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton6(ActionEvent event) {
        if (gameStart == true && randNum == 5) {
            hole5.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton7(ActionEvent event) {
        if (gameStart == true && randNum == 6) {
            hole6.setIcon(null);
            sleepTimerTryCatch(500);
            scoreCount++;
            scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
            ethanHit();
        } else {
            miss++;
            misses.setText("Misses: " + (Integer.toString(miss)));
            checkForMisses();
        }
    }

    private void handleButton(ActionEvent event) { // closes program when close button is pressed
        System.exit(0);
    }

    public MainGame() {

        // setting frame sizing parameters
        frame = new JFrame("Whack an Ethan");
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(null);
        frame.setVisible(true);

        // creating and adding properties to close button
        JButton exit = new JButton("CLOSE", null);
        exit.addActionListener(event -> this.handleButton(event));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBounds(50, 300, 100, 50);
        exit.setBackground(Color.RED);
        frame.add(exit);

        /* adds picture as asset to game */icon = new ImageIcon("RollerCoaster/src/GameAsset2.png");

        // code for buttons 1-6
        hole1 = new JButton();
        hole1.addActionListener(event -> this.handleButton2(event));
        hole1.setBorder(BorderFactory.createEmptyBorder());
        hole1.setBounds(300, 250, 200, 200);
        hole1.setBackground(Color.BLACK);

        hole2 = new JButton();
        hole2.addActionListener(event -> this.handleButton3(event));
        hole2.setBorder(BorderFactory.createEmptyBorder());
        hole2.setBounds(550, 250, 200, 200);
        hole2.setBackground(Color.BLACK);

        hole3 = new JButton();
        hole3.addActionListener(event -> this.handleButton4(event));
        hole3.setBorder(BorderFactory.createEmptyBorder());
        hole3.setBounds(800, 250, 200, 200);
        hole3.setBackground(Color.BLACK);

        hole4 = new JButton();
        hole4.addActionListener(event -> this.handleButton5(event));
        hole4.setBorder(BorderFactory.createEmptyBorder());
        hole4.setBounds(300, 500, 200, 200);
        hole4.setBackground(Color.BLACK);

        hole5 = new JButton();
        hole5.addActionListener(event -> this.handleButton6(event));
        hole5.setBorder(BorderFactory.createEmptyBorder());
        hole5.setBounds(550, 500, 200, 200);
        hole5.setBackground(Color.BLACK);

        hole6 = new JButton();
        hole6.addActionListener(event -> this.handleButton7(event));
        hole6.setBorder(BorderFactory.createEmptyBorder());
        hole6.setBounds(800, 500, 200, 200);
        hole6.setBackground(Color.BLACK);

        //label for score and misses

        scoreLabel = new JLabel();
        scoreLabel.setBounds(50, 70, 300, 50);
        scoreLabel.setText("Points: " + (Integer.toString(scoreCount)));
        scoreLabel.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        frame.add(scoreLabel);

        misses = new JLabel();
        misses.setBounds(50, 150, 300, 50);
        misses.setText("Misses: " + (Integer.toString(miss)));
        misses.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        misses.setForeground(Color.RED);
        frame.add(misses);

        //adding all holes

        frame.add(hole1);
        frame.add(hole2);
        frame.add(hole3);
        frame.add(hole4);
        frame.add(hole5);
        frame.add(hole6);

        frame.repaint();

        sleepTimerTryCatch(3000);

        //fist roll

        ethanHit();

        //lets game run

        gameStart = true;

    }

    //number generator
    
    private void ethanHit() {
        if (hitCounter < 25) {
            randNum = (int) (Math.random() * 5) + 1;
            System.out.println(randNum);
            hitCounter++;
            holeAppear1();
            holeAppear2();
            holeAppear3();
            holeAppear4();
            holeAppear5();
            holeAppear6();
        }
        if (scoreCount >= 25) {
            gameStart = false;
            EndScreen endOptions = new EndScreen(frame, scoreCount, miss);
        }

    }

    //checks to see if there has been 3 misses yet

    private void checkForMisses() {
        if (miss >= 3) {
            gameStart = false;
            EndScreen endOptions = new EndScreen(frame, scoreCount, miss);
        }
    }

    //code for making Ethans pop up in holes
    
    public void holeAppear1() {
        if (randNum == 1) {
            hole1.setIcon(icon);

        }
    }

    public void holeAppear2() {
        if (randNum == 2) {
            hole2.setIcon(icon);
        }
    }

    public void holeAppear3() {
        if (randNum == 3) {
            hole3.setIcon(icon);
        }
    }

    public void holeAppear4() {
        if (randNum == 4) {
            hole4.setIcon(icon);
        }
    }

    public void holeAppear5() {
        if (randNum == 5) {
            hole5.setIcon(icon);
        }
    }

    public void holeAppear6() {
        if (randNum == 6) {
            hole6.setIcon(icon);
        }
    }

    //try catch for a thread sleep
    
    public void sleepTimerTryCatch(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
