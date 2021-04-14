package model;

import processing.core.PApplet;
import processing.core.PImage;

public class elements extends PApplet
{
	int posX, posY;
	boolean interacted;
	PImage brace, egg, diamond, coins, barrel;
	PApplet app;

	public elements(int posX, int posY) 
	{
		this.interacted = false;
	}

	public void setup()
	{
		this.brace = loadImage("brace.png");
		this.egg = loadImage("egg.png");
		this.diamond = loadImage("diamond.png");
		this.coins = loadImage("money.png");
		this.barrel = loadImage("barrel.png");
	}
	
	public void draw(PApplet app, int a)
	{
		switch(a)
		{
//		case 0:
//			this.app.image(barrel, posX, posY);
//			break;
//		case 1:
//			this.app.image(brace, posX, posY);
//			break;
//		case 2:
//			this.app.image(coins, posX, posY);
//			break;
//		case 3:
//			this.app.image(diamond, posX, posY);
//			break;
//		case 4:
//			this.app.image(egg, posX, posY);
//			break;
		}
	}
	public void interacted()
	{
		
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

	public PImage getBrace() {
		return brace;
	}

	public void setBrace(PImage brace) {
		this.brace = brace;
	}

	public PImage getEgg() {
		return egg;
	}

	public void setEgg(PImage egg) {
		this.egg = egg;
	}

	public PImage getDiamond() {
		return diamond;
	}

	public void setDiamond(PImage diamond) {
		this.diamond = diamond;
	}

	public PImage getCoins() {
		return coins;
	}

	public void setCoins(PImage coins) {
		this.coins = coins;
	}

	public PImage getBarrel() {
		return barrel;
	}

	public void setBarrel(PImage barrel) {
		this.barrel = barrel;
	}

}
