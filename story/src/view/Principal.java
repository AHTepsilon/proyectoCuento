package view;
import java.util.ArrayList;

import controller.Controller;
import model.elements;
import model.word;
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
	boolean barrelInteracted, braceInteracted, coinsInteracted, diamondInteracted, eggInteracted;
	
	//String[] text;
	
	String newText;
	String[] newTextArr;
	String barrelTXT, braceTXT, coinsTXT, diamondTXT, eggTXT;
	
	//private ArrayList<word> words;

	@Override
	public void setup() //void Start
	{
		//text = loadStrings("tale.txt");
		//words = new ArrayList<word>();
		
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
		
		posX = 1238;
		posY = 556;
		posX1 = 454;
		posY1 = 600;
		posX2 = 1094;
		posY2 = 684;
		posX3 = 27;
		posY3 = 588;
		posX4 = 512;
		posY4 = 449;
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
		
		if(barrelInteracted && braceInteracted && eggInteracted && coinsInteracted && diamondInteracted)
		{
			thirdScene = true;

			newText = barrelTXT.toUpperCase() + " " + braceTXT.toUpperCase() + 
					" " + diamondTXT.toUpperCase() + " " + coinsTXT.toUpperCase()
					+ " " + eggTXT.toUpperCase() + " ";
			newTextArr = split(newText, ' ');
			saveStrings("newText.txt", newTextArr);
		}
		
		if(thirdScene)
		{
			secondScene = false;
			
			image(endScreen, 0, 0);
		}
	}
	
	public void drawSprites()
	{
		posX4 = (mouseX / 15) + 400;
		imageMode(CENTER);
		if(secondScene) 
		{	
			image(barrel, posX, posY);
			image(brace, posX1, posY1);
			image(diamond, posX2, posY2);
			image(egg, posX3, posY3);
			image(coins, posX4, posY4);
		}
	}
	
	public void mousePressed()
	{
		if(dist(mouseX, mouseY, posX, posY) < 50)
		{
			controls.getBarrel().interacted();
			posX = 5000;
			barrelInteracted = true;
			barrelTXT = "barril";
		}
		
		if(dist(mouseX, mouseY, posX1, posY1) < 50)
		{
			controls.getBrace().interacted();
			posX1 = 5000;
			braceInteracted = true;
			braceTXT = "atizador";
		}
		
		if(dist(mouseX, mouseY, posX2, posY2) < 50)
		{
			controls.getEgg().interacted();
			posX2 = 5000;
			eggInteracted = true;
			eggTXT = "huevo";
		}
		
		if(dist(mouseX, mouseY, posX3, posY3) < 50)
		{
			controls.getDiamond().interacted();
			posX3 = 5000;
			diamondInteracted = true;
			diamondTXT = "diamante";
		}
		
		if(dist(mouseX, mouseY, posX4, posY4) < 50)
		{
			controls.getCoins().interacted();
			posY4 = 5000;
			coinsInteracted = true;
			coinsTXT = "oro";
		}
	}

}
