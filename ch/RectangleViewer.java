import javax.swing.JFrame;

public class RectangleViewer
{
   final static int ANIMATION_TIME_IN_SECONDS = 60;
   
   public static void main(String[] args) throws InterruptedException
   {
      
      JFrame frame = new JFrame();

      frame.setSize(400, 600);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);     
      frame.setVisible(true);
      
      RectangleComponent component2 = new RectangleComponent(50, 50, 50, 30);
      frame.add(component2);
      frame.setVisible(true);
      
      FaceComponent component3 = new FaceComponent();
      frame.add(component3);
      frame.setVisible(true);
      
      
      
      //animate the frame
      for (int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++)
       {
             component.nextFrame(frame.getGraphics(), seconds);
             Thread.sleep(1000); //pause it for every second - in miliseconds
             
       }
      
   }
}
