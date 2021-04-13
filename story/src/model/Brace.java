package model;

public class Brace extends elements
{

	public Brace(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void draw() 
	{
		image(brace, 454, 600);
	}

	@Override
	public void interacted() 
	{
		interacted = true;
	}

}
