package javaGrafico;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;

public class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 50, 30, 40);
        g.drawLine(115, 90, 75, 120);
        g.drawLine(75, 120, 45, 90);
        g.drawLine(115, 90, 115, 170);
        g.drawLine(115, 170, 85, 210);
        g.drawLine(85, 210, 85, 255);
        g.drawLine(115, 170, 145, 210);
        g.drawLine(145, 210, 145, 255);
        g.drawLine(115, 90, 135, 140);
        g.drawLine(135, 140, 90, 150);
        g.setColor(Color.BLUE);
        g.fillRect(112, 87, 6, 6);
        g.fillRect(72, 118, 6, 6);
        g.fillRect(42, 87, 6, 6);
        g.fillRect(112, 167, 6, 6);
        g.fillRect(82, 207, 6, 6);
        g.fillRect(82, 252, 6, 6);
        g.fillRect(142, 207, 6, 6);
        g.fillRect(142, 252, 6, 6);
        g.fillRect(132, 137, 6, 6);
        g.fillRect(87, 147, 6, 6);
        g.setColor(Color.GREEN);
    }
}
