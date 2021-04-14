package controller;

import model.Barrel;
import model.Brace;
import model.Coins;
import model.Diamond;
import model.Egg;
import processing.core.PApplet;
import view.Principal;

public class Controller extends PApplet
{
	Barrel barrel;
	Brace brace;
	Egg egg;
	Diamond diamond;
	Coins coins;
	
	PApplet app;
	
	public Controller(PApplet app) 
	{
		barrel = new Barrel(1238, 556);
		brace = new Brace(454, 600);
		egg = new Egg(1094, 684);
		diamond = new Diamond(27, 588);
		coins = new Coins(512, 449);
		
		this.app = app;
	}
	
	public void drawSprites(PApplet app)
	{
		barrel.draw(app, 0);
		brace.draw(app, 1);
		diamond.draw(app, 2);
		coins.draw(app, 3);
		egg.draw(app, 4);
	}
	
	public void interacting()
	{
		if(dist(mouseX, mouseY, barrel.getPosX(), barrel.getPosY()) < 50)
		{
			barrel.interacted();
			Principal.posX = 5000;
		}
		
		if(dist(mouseX, mouseY, brace.getPosX(), brace.getPosY()) < 50)
		{
			brace.interacted();
			Principal.posX1 = 5000;
		}
		
		if(dist(mouseX, mouseY, egg.getPosX(), egg.getPosY()) < 50)
		{
			egg.interacted();
			Principal.posX2 = 5000;
		}
		
		if(dist(mouseX, mouseY, diamond.getPosX(), diamond.getPosY()) < 50)
		{
			diamond.interacted();
			Principal.posX3 = 5000;
		}
		
		if(dist(mouseX, mouseY, coins.getPosX(), coins.getPosY()) < 50)
		{
			coins.interacted();
			Principal.posX4 = 5000;
		}
	}

	public Barrel getBarrel() {
		return barrel;
	}

	public void setBarrel(Barrel barrel) {
		this.barrel = barrel;
	}

	public Brace getBrace() {
		return brace;
	}

	public void setBrace(Brace brace) {
		this.brace = brace;
	}

	public Egg getEgg() {
		return egg;
	}

	public void setEgg(Egg egg) {
		this.egg = egg;
	}

	public Diamond getDiamond() {
		return diamond;
	}

	public void setDiamond(Diamond diamond) {
		this.diamond = diamond;
	}

	public Coins getCoins() {
		return coins;
	}

	public void setCoins(Coins coins) {
		this.coins = coins;
	}

}
