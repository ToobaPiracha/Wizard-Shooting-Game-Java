import java.awt.Graphics;
import java.awt.Rectangle;
//Abstract class
public abstract class GameObject{
	
    protected int x, y;
    protected float velX = 0,velY = 0; //set velocity, speed of our objects going
    protected ID id;
    protected SpriteSheet ss;
    
    //Constructor
    public GameObject(int x,int y, ID id, SpriteSheet ss){
        this.x = x;
        this.y = y;
        this.id = id;
        this.ss = ss;
    }
   
    
	public abstract void tick(); //every object needs upgrade
    public abstract void render(Graphics g);//every objects needs to draw something/appear to be something
    public abstract Rectangle getBounds(); //for collision detection, every object will be rectangle
    
    
    //creating getter and setters for all objects
    public ID getId() {
		return id;
	}
	public void setId(ID id) {
		this.id = id;
	}
    
   
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	public float getVelX() {
		return velX;
	}


	public void setVelX(float velX) {
		this.velX = velX;
	}


	public float getVelY() {
		return velY;
	}


	public void setVelY(float velY) {
		this.velY = velY;
	}                                            
}
