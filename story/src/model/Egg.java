package model;

public class Egg extends elements
{

	public Egg(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void draw() 
	{
		image(egg, 1094, 684);
	}

	@Override
	public void interacted() 
	{
		interacted = true;
	}

}
