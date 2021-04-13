package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class elements extends PApplet
{
	int posX, posY;
	boolean interacted;
	PImage brace, egg, diamond, coins, barrel;

	public elements(int posX, int posY) 
	{
		this.interacted = false;
		
		this.brace = loadImage("brace.png");
		this.egg = loadImage("egg.png");
		this.diamond = loadImage("diamond.png");
		this.coins = loadImage("money.png");
		this.barrel = loadImage("barrel.png");
	}
	
	public abstract void draw();
	public abstract void interacted();

}
