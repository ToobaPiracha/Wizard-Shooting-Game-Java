//initializes the keys for movements

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Game.STATE;

public class KeyInput extends KeyAdapter{
	
	Handler handler; 
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
//initialized & handled in Handler class
    public void keyPressed(KeyEvent e){
    	int key = e.getKeyCode();
    	
    	for(int i=0;i<handler.object.size();i++){
    	    GameObject tempObject=handler.object.get(i);
    	    
    	    //setting up the keys for the movement of player when pressed
    	    if(tempObject.getId() == ID.Player){
    	        if(key == KeyEvent.VK_W)handler.setUp(true);
    	        if(key == KeyEvent.VK_S)handler.setDown(true);
    	        if(key == KeyEvent.VK_A)handler.setLeft(true);
    	        if(key == KeyEvent.VK_D)handler.setRight(true);
    	    }
    	}
		}
    //method when keys are released 
   public void keyReleased(KeyEvent e){
	    	int key = e.getKeyCode();    	
	    	for(int i=0;i<handler.object.size();i++){
	    	    GameObject tempObject=handler.object.get(i);
	    	    
	    	    if(tempObject.getId() == ID.Player){
	    	        if(key == KeyEvent.VK_W)handler.setUp(false);
	    	        if(key == KeyEvent.VK_S)handler.setDown(false);
	    	        if(key == KeyEvent.VK_A)handler.setLeft(false);
	    	        if(key == KeyEvent.VK_D)handler.setRight(false);
	    	    }
	    	} 
   }
   }
