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
		image(barrel, posX, posY);
	}

	@Override
	public void interacted() 
	{
		posX += 5000;
		interacted = true;
	}

}
