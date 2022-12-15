package labs.lab4;
import javax.swing.*;

import java.awt.*;
import java.awt.Graphics;


public class StickFigure1 extends JFrame{
    protected int baseX;
    protected int baseY;
    private int height;
    protected Color color;
    
    public StickFigure1(int x, int y, Color c, int aHeight){
        baseX = x;
        baseY = y;
        color = c;
        height = aHeight;
        
    }
    public StickFigure1(){}
    public void setX(int x){
        baseX = x;
    }
    public void setY(int y){
        baseY = y;
    }
    //public class Draw extends JComponent{
        @Override
        public void paint(Graphics aGraphics){ // r should be positive if coming closer negative if farther
            int r = 0;

            //aGraphics.setColor(Color.WHITE);
            aGraphics.drawOval(baseX - (height/3 + r/3)/2, baseY - height - r/3 + (height/2 + r/2)/2, height/3 + r/3, height/2 + r/2);
            
            aGraphics.drawLine(baseX, baseY, baseX, baseY + height + r/3); // body

            aGraphics.drawLine(baseX, baseY, baseX - baseX/4 - r/3, baseY + height/2 + r/3); 

            aGraphics.drawLine(baseX, baseY, baseX + baseX/4 + r/3, baseY + height/2 + r/3);


            aGraphics.drawLine(baseX, baseY + height, baseX - baseX/4 - r/3, baseY + height + height/2 + r/3); 

            aGraphics.drawLine(baseX, baseY + height, baseX + baseX/4 + r/3, baseY + height/2 + height + r/3);
            aGraphics.drawOval(baseX - (height/3 + r/3)/2 + 10, baseY - height - r/3 + (height/2 + r/2)/2 + 20, height / 20, height / 20);
        aGraphics.fillOval(baseX - (height/3 + r/3)/2 + 20, baseY - height - r/3 + (height/2 + r/2)/2 + 20, height / 20, height / 20);
            
            //this.setBackground(Color.BLACK);
        }
        public void paint_rev(Graphics g,int a){
            int r = a;

            g.drawOval(baseX - (height/3 + r/3)/2, baseY - height - r/3 + (height/2 + r/2)/2, height/3 + r/3, height/2 + r/2);
            
            g.drawLine(baseX, baseY, baseX - baseX/4 - r/3, baseY + height/2 + r/3); 

            g.drawLine(baseX, baseY, baseX + baseX/4 + r/3, baseY + height/2 + r/3);


            g.drawLine(baseX, baseY + height, baseX - baseX/4 - r/3, baseY + height + height/2 + r/3); 

            g.drawLine(baseX, baseY + height, baseX + baseX/4 + r/3, baseY + height/2 + height + r/3);
            g.fillOval(baseX - (height/3 + r/3)/2 + 20, baseY - height - r/3 + (height/2 + r/2)/2 + 20, height / 20, height / 20);

        }
    //}
    public static void main(String[] args) {
        Aly a = new Aly(200,100,Color.MAGENTA, 60);
        a.remake();
        // Graphics g = a.getGraphics();
        // a.paint_rev(g, 10);
        
        
    }
}
