package com.blackpensoftware.spacerace.display;

import java.awt.*;

/**
 * Created by Benjamin DosSantos on 3/19/2017.
 */
public class DisplayHandler {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
}// End of class
