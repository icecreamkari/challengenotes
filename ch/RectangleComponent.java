import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  

   int x,y,w,h;
   Rectangle box;
   Color what;
   Graphics2D g2, hi;
   
   public RectangleComponent()
   {
       this.x = 5;
       this.y = 10;
       this.w = 20;
       this.h = 30;
       box = new Rectangle(x, y, w, h);
    }

   public RectangleComponent(int x, int y, int w, int h)
   {
       this.x = x;
       this.y = y;
       this.w = w;
       this.h = h;
       
       box = new Rectangle(x, y, w, h);
    }
    
    public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct a rectangle and draw it
      //upper left hand coordinate is 0,0
      //                            x, y, width, height   
      //Rectangle box = new Rectangle(5, 10, 20, 30);
      //Rectangle box = new Rectangle(x,y,w,h);
      
      g2.setColor(what);
      g2.draw(box);
      g2.fill(box);

      // Move rectangle 15 units to the right and 25 units down
      // drawing the same component twice
      box.translate(x +10, y + 15);

      // Draw moved rectangle
      g2.draw(box);
      
      //repaint();
   }
   
   
   public void nextFrame(Graphics hi, int time)
   {
       //updates the objects in the cityscape so they are animated
      
       Graphics hi2 = (Graphics2D) hi;
      
       if (time%2 ==0)
            what = Color.CYAN;
       else
            what = Color.MAGENTA;
        
        
       hi.setColor(what);
       hi.drawString("Help Me!",100, 100);
       repaint();
  
    }
}//end of class
