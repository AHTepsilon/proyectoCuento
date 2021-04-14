package model;

public class Coins extends elements
{
	public Coins(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void interacted() 
	{
		posX += 5000;
		interacted = true;
	}

}
