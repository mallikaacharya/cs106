/**
 * 
 */

/**
 * @author mallikaacharya
 *
 */
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;

import javax.imageio.*;

import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
public class DrawImage { 

	/**
	 * @param args
	 */
	PrinterJob job = PrinterJob.getPrinterJob();  	
	public static void DrawImage() {
	
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("Eye1.jpg"));
		} catch (IOException e) {
		}	
		
		
	}
}