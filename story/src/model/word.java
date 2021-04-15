package model;

import processing.core.PApplet;

public class word 
{
	private String value;
	int innerPosition;
	
	public word(String value, int innerPosition) 
	{
        this.value = value;
        this.innerPosition = innerPosition;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
