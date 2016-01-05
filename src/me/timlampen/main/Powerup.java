package me.timlampen.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import me.timlampen.classes.EntityC;

public class Powerup extends GameObject implements EntityC{
	Textures tex;
	private Game game;
	private Controller c;
	Random r = new Random();
	int speed = r.nextInt(3)+1;
	public Powerup(double x, double y, Textures tex, Game game, Controller c) {
		super(x, y);
		this.tex = tex;
	}

	@Override
	public void tick() {
		y-=new Random().nextInt(5)+1;
		x-=new Random().nextInt(5)+1;
		if(Physics.Collision(this, game.ea)){
			c.removeEntity(this);
			System.out.println("power");
		}
		y += speed;
		
		if(y > Game.HEIGHT * Game.SCALE){
			speed = r.nextInt(3)+1;
			x = r.nextInt(640);
			y = -10;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(tex.player, (int)x, (int)y, null);
		
	}

	@Override
	public double getY() {
		return x;
	}

	@Override
	public double getX() {
		return y;
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}

}
