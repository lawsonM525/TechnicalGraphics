import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

    Image image;
    
    MyPanel(){

        image = new ImageIcon("woman.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){//invoked automatically when JFrame is instantiated
        
        Graphics2D g2D = (Graphics2D) g;//cast g to Graphics2D

        g2D.setStroke(new BasicStroke(5));

        g2D.setFont(new Font("Ink Free", Font.BOLD, 20));

        //point 1
        g2D.setPaint(Color.orange);
        g2D.fillOval(0,0,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("1", 20, 30);

        //point 2
        g2D.setPaint(Color.red);
        g2D.fillOval(0,450,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("2", 20, 480);

        //point 3
        g2D.setPaint(Color.blue);
        g2D.fillOval(450,450,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("3", 470, 480);

        //point 4
        g2D.setPaint(Color.green);
        g2D.fillOval(450,0,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("4", 470, 30);

        //point 5
        g2D.setPaint(Color.yellow);
        g2D.fillOval(225,225,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("5", 245, 255);

        //point 6
        g2D.setPaint(Color.magenta);
        g2D.fillOval(225,0,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("6", 245, 30);

        //point 7
        g2D.setPaint(Color.cyan);
        g2D.fillOval(225,450,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("7", 245, 480);

        //point 8
        g2D.setPaint(Color.pink);
        g2D.fillOval(0,225,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("8", 20, 255);

        //point 9
        g2D.setPaint(Color.gray);
        g2D.fillOval(450,225,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("9", 470, 255);

        //point 10
        g2D.setPaint(Color.lightGray);
        g2D.fillOval(112,112,50,50);
        g2D.setPaint(Color.black);
        g2D.drawString("10", 132, 142);


        
    }
}
