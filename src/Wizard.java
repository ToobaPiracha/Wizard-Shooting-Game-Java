//main player class
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
//child class of game object
public class Wizard extends GameObject{
	//attributes
	Handler handler; 
	Game game;
	
	private BufferedImage wizard_image ; //manipulates the image data
	
    //constructor is made
	public Wizard(int x,int y,ID id, Handler handler, Game game, SpriteSheet ss){
        super(x, y, id, ss);
        this.handler = handler;
        this.game = game;
        
        wizard_image = ss.grabImage(1, 1, 32, 48);
      
    }
	//tick method is created which updates the frame 60 times per second
    public void tick(){
    	x += velX;
    	y += velY;
    	
    	collision();
    	
    	
    	// movement
    	if(handler.isUp())velY = -5;
    	else if(!handler.isDown())velY=0;
    	
    	if(handler.isDown())velY=5;
    	else if(!handler.isUp())velY=0;
    	
    	if(handler.isRight())velX=5;
    	else if(!handler.isLeft())velX=0;
    	
    	if(handler.isLeft())velX=-5;
    	else if(!handler.isRight())velX=0;
    	
    	
    }
    //collision method is created which helps the player stop in front of the block
    private void collision() {
     for(int i = 0; i < handler.object.size(); i++) {
    	 
    	  GameObject tempObject = handler.object.get(i);
    	  
    	  if(tempObject.getId() == ID.Block) {
    		  
    		  //intersect library is introduced which determines the intersection between player and block
    		  if(getBounds().intersects(tempObject.getBounds())) {
    			  x += velX * -1;
    			  y += velY * -1;
    	  }
    	  }
    	  
    	//intersect library is introduced which determines the intersection between player and crate
    	  if(tempObject.getId() == ID.Crate) {
    		  
    		  if(getBounds().intersects(tempObject.getBounds())) {
    			game.ammo += 20;
    			handler.removeObject(tempObject);
     }
    	  }
    	  
    	//intersect library is introduced which determines the intersection between player and enemy
              if(tempObject.getId() == ID.Enemy) {
    		  if(getBounds().intersects(tempObject.getBounds())) {
    			game.hp--;
    		  }
    		  else if(game.hp==0) { //condition that when health is empty the game will exit
    			 System.exit(0); 
    		  }
              }
     }
    }

    //render method is created which converts the image into 2D and 3D
    public void render(Graphics g){
    	g.drawImage(wizard_image, x, y, null);
    }
     
    
    //this constructor helps create a rectangle
    public Rectangle getBounds(){
        return new Rectangle(x, y, 32, 48);
    }
    
}
