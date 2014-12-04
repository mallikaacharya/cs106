/**
 * 
 */

/**
 * @author mallikaacharya
 *
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class JPG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage pic = null;
		try {
		    pic = ImageIO.read(new File("Eye1.jpg"));
		} catch (IOException e) {
		}
	}
}
