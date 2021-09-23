package com.ness;

// only classes in package = not subpackages
import java.awt.*;
// therefore we need to do another imports
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWIndow extends Frame {

    public MyWIndow(String title)  {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Java", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Maros", 60, 100);
    }
}
