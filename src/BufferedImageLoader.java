// Java BufferedImage class is a subclass of Image class. 
//It is used to handle and manipulate the image data.
//A BufferedImage is made of ColorModel of image data. 
//All BufferedImage objects have an upper left corner coordinate of (0, 0).

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BufferedImageLoader{  //Image I/O recognises the contents of the file as a JPEG format image, 
	//and decodes it into a BufferedImage which can be directly used by Java 2D.
                                        
    private BufferedImage image;
    
    public BufferedImage loadImage(String path){
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch(IOException e) {
        	
            e.printStackTrace();
        }
        return image;
}
}
                                 