import javax.swing.JFrame;
import java.util.Random;

public class CircleViewer
{
    final static int ANIMATION_TIME_IN_SECONDS = 60;
    
    public static void main(String[] args) throws InterruptedException
    {
        //creates a new frame
        JFrame frame = new JFrame();
        //sets the frame to 300 by 500 pixels
        frame.setSize(300, 500);
        //titles the window displays circle
        frame.setTitle("Displays Circle");
        //closes the frame when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //generates a random number for x, y, and d values
        Random generator = new Random();
        int x = generator.nextInt(300); //x pos
        int y = generator.nextInt(500); //y pos
        int d = generator.nextInt(100); //d pos

        //creates a new circle
        CircleComponent circle = new CircleComponent(x, y, d);
        //adds the circle to the frame
        frame.add(circle);
        
        //makes the frame visible
        frame.setVisible(true);
        
        //animate the frame
        for (int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++)
          {
             circle.nextFrame(frame.getGraphics(), seconds);
             Thread.sleep(1000); //pause it for every second - in miliseconds
          }
 
    }//end of main
}//end of class