package javaGrafico;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private int x,y;
    public Board() {
        this.x = 0;
        this.y = 0;
        timer = new Timer(20, this);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.x += 5;
        this.y += 10;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 50, 30, 40);
        g.drawLine(115, 90, 75, 120);//Antebrazo izquierdo
        g.drawLine(75, 120, 45, 90);//Brazo izquierdo
        g.drawLine(115, 90, 115, 170);//Torso
        g.drawLine(115, 170, 85, 210);//Antepierna izquierda
        g.drawLine(85, 210, 85, 255);//Pierna izquierda
        g.drawLine(115, 170, 145, 210);//Antepierna derecha
        g.drawLine(145, 210, 145, 255);//Pierna derecha
        g.drawLine(115, 90, 135, 140);//Antebrazo derecho
        g.drawLine(135, 140, 90, 150);//Brazo derecho
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
