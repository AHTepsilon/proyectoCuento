package model;

public class Diamond extends elements
{

	public Diamond(int posX, int posY) 
	{
		super(posX, posY);
	}

	@Override
	public void draw() 
	{
		image(diamond, 27, 588);
	}

	@Override
	public void interacted() 
	{
		interacted = true;
	}

}
