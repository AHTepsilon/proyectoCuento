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
	}
	
	public abstract void draw();
	public abstract void interacted();
	
	public void setup()
	{
		this.brace = loadImage("brace.png");
		this.egg = loadImage("egg.png");
		this.diamond = loadImage("diamond.png");
		this.coins = loadImage("money.png");
		this.barrel = loadImage("barrel.png");
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isInteracted() {
		return interacted;
	}

	public void setInteracted(boolean interacted) {
		this.interacted = interacted;
	}

}
