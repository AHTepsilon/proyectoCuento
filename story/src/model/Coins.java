package model;

public class Coins extends elements
{

	public Coins(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void draw() 
	{
		image(coins, 512, 449);
	}

	@Override
	public void interacted() 
	{
		interacted = true;
	}

}
