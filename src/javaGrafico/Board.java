package javaGrafico;
import java.awt.event.*;
import java.awt.*;
import static java.lang.Math.pow;
import javax.swing.*;
import static java.lang.Math.sqrt;

public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private int circuloX,circuloY;
    private double pata1X,pata1Y;
    private double pata2X,pata2Y;
    private int cuerpoX,cuerpoY=50;
    private boolean b1,b2=true;
    public Board() {
        this.circuloX = 1000;
        this.circuloY = 55;
        timer = new Timer(20, this);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //movimiento Círculo
        if(this.circuloX == -30)
            this.circuloX = 1000;
        this.circuloX--;
        //Movimiento patas derechas
        switch((int)this.pata1X){
            case -10:
                this.b1 = true;
                break;
            case 10:
                this.b1 = false;
                break;
        }
        if(this.b1)
            this.pata1X += 1;
        else
            this.pata1X -= 0.5;
        this.pata1Y = sqrt(100-pow(this.pata1X,2));
        //Movimiento patas izquierdas
        switch((int)this.pata2X){
            case -10:
                this.b2 = true;
                break;
            case 10:
                this.b2 = false;
                break;
        }
        if(this.b2)
            this.pata2X += 1;
        else
            this.pata2X -= 0.5;
        this.pata2Y = sqrt(100-pow(this.pata2X,2));
        //Movimiento Cuerpo
        if(this.cuerpoX == 1000)
            this.cuerpoX = -60;
        this.cuerpoX += 2;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Persona
        /*
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
        g.fillRect(112, 87, 6, 6);//Cuello
        g.fillRect(72, 118, 6, 6);//Codo izquierdo
        g.fillRect(42, 87, 6, 6);//Mano izquierda
        g.fillRect(112, 167, 6, 6);//
        g.fillRect(82, 207, 6, 6);
        g.fillRect(82, 252, 6, 6);
        g.fillRect(142, 207, 6, 6);
        g.fillRect(142, 252, 6, 6);
        g.fillRect(132, 137, 6, 6);
        g.fillRect(87, 147, 6, 6);
        g.setColor(Color.GREEN);
        */
        //Cuadro
        Graphics2D g2d = (Graphics2D) g;
        Rectangle cuerpo = new Rectangle(this.cuerpoX,this.cuerpoY,60,40);
        g2d.drawRect(WIDTH, WIDTH, WIDTH, WIDTH);
        g2d.drawLine(this.cuerpoX, this.cuerpoY + 40, this.cuerpoX + (int)this.pata1X, this.cuerpoY + 40 + (int)this.pata1Y);
        g2d.drawLine(this.cuerpoX, this.cuerpoY + 40, this.cuerpoX + (int)this.pata2X, this.cuerpoY + 40 + (int)this.pata2Y);
        g2d.drawLine(this.cuerpoX + 60, this.cuerpoY + 40, this.cuerpoX + 60 + (int)this.pata1X, this.cuerpoY + 40 + (int)this.pata1Y);
        g2d.drawLine(this.cuerpoX + 60, this.cuerpoY + 40, this.cuerpoX + 60 + (int)this.pata2X, this.cuerpoY + 40 + (int)this.pata2Y);
        g2d.drawOval(this.circuloX, this.circuloY, 30, 30);
        
    }
}
