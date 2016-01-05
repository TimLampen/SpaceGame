package me.timlampen.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import me.timlampen.classes.EntityA;

public class Bullet extends GameObject implements EntityA{
	Game game;
	private Textures tex;
	public Bullet(double x, double y, Textures tex, Game game){
		super(x,y);
		this.tex = tex;
		this.game = game;
	}
	
	public void tick(){
		y -=10;
	}
	
	public void render(Graphics g){
		g.drawImage(tex.missle, (int)x, (int)y, null);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}
}
