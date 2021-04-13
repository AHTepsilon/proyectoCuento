package controller;

import model.Barrel;
import model.Brace;
import model.Coins;
import model.Diamond;
import model.Egg;
import processing.core.PApplet;

public class Controller extends PApplet
{
	Barrel barrel;
	Brace brace;
	Egg egg;
	Diamond diamond;
	Coins coins;
	
	public Controller() 
	{
		barrel = new Barrel(1238, 556);
		brace = new Brace(454, 600);
		egg = new Egg(1094, 684);
		diamond = new Diamond(27, 588);
		coins = new Coins(512, 449);
	}
	
	public void drawSprites()
	{
		barrel.draw();
		brace.draw();
		egg.draw();
		diamond.draw();
		coins.draw();
	}
	
	public void mousePressed()
	{
		if(dist(mouseX, mouseY, barrel.getPosX(), barrel.getPosY()) < 10)
		{
			barrel.interacted();
		}
		
		if(dist(mouseX, mouseY, brace.getPosX(), brace.getPosY()) < 10)
		{
			brace.interacted();
		}
		
		if(dist(mouseX, mouseY, egg.getPosX(), egg.getPosY()) < 10)
		{
			egg.interacted();
		}
		
		if(dist(mouseX, mouseY, diamond.getPosX(), diamond.getPosY()) < 10)
		{
			diamond.interacted();
		}
		
		if(dist(mouseX, mouseY, coins.getPosX(), coins.getPosY()) < 10)
		{
			coins.interacted();
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
