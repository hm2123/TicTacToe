import java.awt.Graphics;
import javax.swing.JApplet;
public class TicTacToe extends JApplet {
    public void paint(Graphics canvas) {
        canvas.drawLine( 200, 50, 200, 600);
        canvas.drawLine( 400, 50,  400,  600);
        canvas.drawLine( 50, 200,  600,  200);
        canvas.drawLine( 50,400, 600,  400);
        //first x\
        canvas.drawLine(  50,  250,  150,  350);
        canvas.drawLine(  50,  350, 150,  250);
        //second x\
        canvas.drawLine(  250, 250, 350,  350);
        canvas.drawLine( 250,  350,  350,  250);
        //third x\
        canvas.drawLine(  450,  250,  550,  350);
        canvas.drawLine(  450,  350,  550,  250);
        //strikethrough x\
        canvas.drawLine(  50,  300,  600,  300);
        //first o
        canvas.drawOval(  250, 75,  100,  100);
        //second o
        canvas.drawOval(  450,  75,  100, 100);
        //third o
        canvas.drawOval(  450,  475, 100,  100);
    }
}

