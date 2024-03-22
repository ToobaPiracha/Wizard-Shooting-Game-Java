import java.awt.Dimension;
//in Game class(Main class) we are going to make instance of our window class
import javax.swing.JFrame; //Library for our JFrame

public class Window{
	
//Constructor with arguments
   public Window(int width,int height,String title,Game game){
	   
   //we'll add game class's constructor into our JFrame
        JFrame frame = new JFrame(title); //frame instance
        
        //setting size
        frame.setPreferredSize(new Dimension(width,height)); //top border layout
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height)); //limit of the window size
        
        //adding our class to the frame because it uses canvas java, works together with JFrame 
      //this shows how big our window is going to be
        //implemented this in run method in Game class
        
        frame.add(game); //extends canvas library
        frame.setResizable(false); //Canvas resizable is false
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //it means when we start the game the window will open in very center of the screen
        frame.setVisible(true);
        
        
   }
}