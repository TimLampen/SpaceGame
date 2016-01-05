package me.timlampen.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.util.Random;

import me.timlampen.classes.EntityB;

public class Enemy extends GameObject implements EntityB{
	private Game game;
	private Controller c;
	Random r = new Random();
	int speed = r.nextInt(3)+1;
	private Textures tex;
	public Enemy(double x, double y, Textures tex, Game game, Controller c){
		super(x,y);
		this.tex = tex;
		this.game = game;
		this.c = c;
	}
	
	public void tick(){
		if(Physics.Collision(this, game.ea)){
			c.removeEntity(this);
			game.setEnemy_killed(game.getEnemy_killed()+1);
		}
		y += speed;
		
		if(y > Game.HEIGHT * Game.SCALE){
			speed = r.nextInt(3)+1;
			x = r.nextInt(640);
			y = -10;
		}
	}
	
	public void render(Graphics g){
		g.drawImage(tex.enemy, (int)x, (int)y, null);
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32 ,32);
	}
	
	public double getY(){
		return y;
	}
	public double getX(){
		return x;
	}
	
}
