package model;

public class Diamond extends elements
{
	public Diamond(int posX, int posY) 
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
