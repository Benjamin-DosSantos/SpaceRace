package com.blackpensoftware.spacerace.core;

import com.blackpensoftware.spacerace.display.DisplayHandler;
import com.blackpensoftware.spacerace.drawing.GamePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Benjamin DosSantos on 3/19/2017.
 */
public class SpaceRace {
    static DisplayHandler displayHandler = new DisplayHandler();
    static GamePanel gamePanel = new GamePanel();
    
    public static void main(String[] args){
        String panelName = "Space Race";
        JFrame spaceRace = new JFrame(panelName);
        
        spaceRace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spaceRace.setSize((int) displayHandler.getWidth() / 2, (int) displayHandler.getHeight() / 2);
        spaceRace.setLocation((int) displayHandler.getWidth() / 4, (int) displayHandler.getHeight() / 4);
    
        spaceRace.add(gamePanel);
        
        spaceRace.setVisible(true);
    }// End of main method
}// End of class
