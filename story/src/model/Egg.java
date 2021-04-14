package model;

public class Egg extends elements
{
	public Egg(int posX, int posY) 
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
