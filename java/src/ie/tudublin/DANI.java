package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet 
{
	Word w;
	Follow f;
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() 
	{
		if  (keyPressed) 
		{
			if (key == ' ') 
			{
				w.loadwords();
				print(w.render(null));
			}
		} 
	}

	

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
	}
}
