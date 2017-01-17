import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;

/**
 * A component that draws an alien face
 */
public class CircleComponent extends JComponent
{
    Color shade; //creates a new color called shade
    Graphics2D g2, hi; 
    Random generator = new Random();
    
    /**
     * Circle constructor
     */
    CircleComponent(int xpos, int ypos, int diameter)
    {
        int x = xpos;
        int y = ypos;
        int w = diameter;
        int h = diameter;
        
        //circle = new Ellipse2D.Double(x, y, w, h);
        
    }
    
        
   
    /**
    * draws a circle
    */
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
       
        //loop to create 50 circles
        for (int number = 0; number <50; number ++)
        {
            //randomly generates a values based on size of frame
            int x = generator.nextInt(300); //x position
            int y = generator.nextInt(500); //y position
            int d = generator.nextInt(100); //diamter value
            
            //sets width and height to the diamter
            int w = d;
            int h = d;
            
            //generates a number from 1 - 4
            int colornumber = generator.nextInt(4);
            
            //each number corresponds to a color
            if (colornumber == 0)
                shade = Color.CYAN;
            else if (colornumber == 1)
                shade = Color.MAGENTA;
            else if (colornumber == 2)
                shade = Color.BLUE;
            else
                shade = Color.GREEN;
            
            //sets the graphic to the color
            g2.setColor(shade);
            
            //creates a circle using the values previously generated
            Ellipse2D.Double circle1 = new Ellipse2D.Double(x, y, w, h);
            //draws a circle
            g2.draw(circle1);
            
            //generates a number that will decide if the circle will be filled
            int fillcircle = generator.nextInt(2);
            //if number generated is 1, the circle will be filled with color
            if (fillcircle == 1)
                g2.fill(circle1);
        }
    }//end of PaintComponent
    
    /**
     * creates another frame
     */
    public void nextFrame(Graphics hi, int time)
    {
       //updates the objects in the cityscape so they are animated
      
       Graphics hi2 = (Graphics2D) hi;
       
       //generates a random number to correspond to a color
       int colornumber = generator.nextInt(4);
            
       //if time can be evely divded by two
       if (time%2 ==0)
           {
            //sets color to the color that corresponds with the number generated
            if (colornumber == 0)
                shade = Color.CYAN;
            else if (colornumber == 1)
                shade = Color.MAGENTA;
            else if (colornumber == 2)
                shade = Color.BLUE;
            else
                shade = Color.GREEN;  
            }
       else
            {
            //sets color to the color that corresponds with the number generated
            if (colornumber == 0)
                shade = Color.CYAN;
            else if (colornumber == 1)
                shade = Color.MAGENTA;
            else if (colornumber == 2)
                shade = Color.BLUE;
            else
                shade = Color.GREEN;  
            }
        
       //sets the graphic to the new color
       hi.setColor(shade);
       //hi.drawString("Help Me!",100, 100);
       repaint();
    }//end of nextFrame
}//end of class