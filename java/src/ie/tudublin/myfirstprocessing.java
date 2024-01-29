package ie.tudublin;

import processing.core.PApplet;

public class myfirstprocessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	

		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
        line(10,10,100,100); //x1 y1 x2 y2
        ellipse(200, 80, 90, 200);
        circle(200, 300, 40);
        background(225, 0xff, 0);
        
		
	}
}
