package GUIClock;

import processing.core.PApplet;
import processing.core.PImage;

public class staticClock extends PApplet{
	
	PImage backgroundIMG;
	String URL = "https://affordableholidaysblog.files.wordpress.com/2015/05/matira-beach-bora-bora2.jpg";
	
	@Override
	public void setup() {
	
		size(800,600);
		backgroundIMG = loadImage(URL,"jpg");
		backgroundIMG.resize(0, height);
		image(backgroundIMG,0,0);
		
	}
	

	@Override
	public void draw() {
	
		fill(255,120,0);
		ellipse(width/4,height/5,width/5,height/5);
	}

	
	

}
