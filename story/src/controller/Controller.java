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

}
