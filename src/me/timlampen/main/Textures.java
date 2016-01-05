package me.timlampen.main;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Textures {
	
	public BufferedImage player, missle, enemy, lose;
	private SpriteSheet ss;
	
	public Textures(Game game){
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}
	
	private void getTextures(){
		player = ss.grabImage(2, 1, 32, 32);
		missle = ss.grabImage(8, 1, 32, 32);
		enemy = ss.grabImage(6, 1, 32, 32);
		lose = ss.grabImage(1, 2, 192, 32);
	}
	
	public int getRandomInt(){
		int output = 0;
		Random r = new Random();
		int ran = 1;
		switch(ran){
		case 1:
			output = 3;
		case 2:
			output = 4;
		case 3:
			output = 5;
		case 4:
			output = 6;
		case 5:
			output = 7;
		}
		
		return output;
	}
}
