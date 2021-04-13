package model;

public class Barrel extends elements
{

	public Barrel(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void draw() 
	{
		image(barrel, 1238, 556);
	}

	@Override
	public void interacted() 
	{
		interacted = true;
	}

}
