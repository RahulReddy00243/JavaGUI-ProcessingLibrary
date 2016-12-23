package GUIClock;

import processing.core.PApplet;
import processing.core.PImage;

public class DynamicClock extends PApplet {
	
	private PImage backgroundIMG;
	private String URL = "https://affordableholidaysblog.files.wordpress.com/2015/05/matira-beach-bora-bora2.jpg";

	@Override
	public void setup() {
		
		// setup method is called only once when the applet starts

		// setting the size of the canvas
		size(800, 600);

		

	}

	@Override
	public void draw() {
		
		//draw method is called every time there is a change
		
		// loading the image in to the memory
				backgroundIMG = loadImage(URL, "jpg");

		// adjusting the background image to canvas size
		backgroundIMG.resize(0, height);
		image(backgroundIMG, 0, 0);

	
		int [] rgb = clock(abs(second()-30)); 
		fill(rgb[0], rgb[1], 0);
		ellipse(width / 4, height / 5, width / 5, height / 5);
		
	}

	public int[] clock(float seconds){
		
		int[] colors = new int[3];
		
		float time = seconds/30;
		
		colors[0] = (int) (time*255);
		colors[1] = (int) (time*200);
		colors[0] = 0;


		
		
		
		return colors;
		
	}
	
}
