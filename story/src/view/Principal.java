package view;
import controller.Controller;
import model.elements;
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
	PImage barrel, brace, coins, diamond, egg;
	boolean firstScene, secondScene, thirdScene;
	int paralaxX;
	
	Controller controls;
	
	public static int posX, posY, posX1, posY1, posX2, posY2, posX3, posY3, posX4, posY4;
	
	@Override
	public void setup() //void Start
	{
		startScreen = loadImage("backGround.png");
		gameScreen = loadImage("game screen.png");
		paralax = loadImage("paralax.png");
		charAndText = loadImage("characterANDtext.png");
		sky = loadImage("sky.png");
		endScreen = loadImage("gameEnd.png");
		
		barrel = loadImage("barrel.png");
		brace = loadImage("brace.png");
		coins = loadImage("money.png");
		diamond = loadImage("diamond.png");
		egg = loadImage("egg.png");
		
		firstScene = true;
		
		paralaxX = -40;
		controls = new Controller(this);
	}
	
	@Override
	public void draw() //void Update
	{		
		background(255);
		System.out.println(posX + ", " + mouseY);
		changeScene();
		drawSprites();
	}
	
	public void changeScene()
	{
		imageMode(CORNER);
		
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
		
		if(keyPressed && key == 'O' || key == 'o') //This is just a debug feature to test the scene change
		{
			thirdScene = true;
		}
		
		if(thirdScene)
		{
			secondScene = false;
			
			image(endScreen, 0, 0);
			
			if(mousePressed)
			{
				exit();
			}
		}
	}
	
	public void drawSprites()
	{
		imageMode(CENTER);
		if(secondScene) 
		{
			posX4 = (mouseX / 15) + 400;
			
			image(barrel, posX, posY);
			image(brace, posX1, posY1);
			image(diamond, posX2, posY2);
			image(egg, posX3, posY3);
			image(coins, posX4, posY4);
		}
	}
	
	public void mousePressed()
	{
		controls.interacting();
	}

}
