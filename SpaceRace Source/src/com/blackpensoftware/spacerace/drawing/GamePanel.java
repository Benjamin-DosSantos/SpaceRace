package com.blackpensoftware.spacerace.drawing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Benjamin DosSantos on 3/19/2017.
 */
public class GamePanel extends JPanel {
    int xPos = 0;
    int yPos = 0;
    
    public GamePanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    }// End of constructor
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(xPos, yPos, 100, 100);
    }// End of paint method
}// End of class
