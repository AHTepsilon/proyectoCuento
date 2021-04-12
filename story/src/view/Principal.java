package view;
import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("view.Principal");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(1400, 800);
	}
	
	PImage startScreen, backGround, gameScreen, endScreen, paralax, charAndText, sky;
	boolean firstScene, secondScene, thirdScene;
	int paralaxX;
	
	@Override
	public void setup() //void Start
	{
		startScreen = loadImage("backGround.png");
		gameScreen = loadImage("game screen.png");
		paralax = loadImage("paralax.png");
		charAndText = loadImage("characterANDtext.png");
		sky = loadImage("sky.png");
		
		firstScene = true;
		
		paralaxX = -40;
	}
	
	@Override
	public void draw() //void Update
	{		
		background(255);
		System.out.println(mouseX + ", " + mouseY);
		changeScene();
	}
	
	public void changeScene()
	{
		if(firstScene)
		{
			image(startScreen, 0, 0);
			firstScene = true;
		}
		
		if(mousePressed && mouseX > 488 && mouseX < 888 && mouseY > 596 && mouseY < 695)
		{
			secondScene = true;
		}
		
		if(secondScene)
		{
			paralaxX = (mouseX - 1400) / 15;
			
			image(sky, 0, 0);
			image(paralax, paralaxX, 0);
			image(gameScreen, 0, 0);
			image(charAndText, 0, 0);
			firstScene = false;
		}
	}

}
