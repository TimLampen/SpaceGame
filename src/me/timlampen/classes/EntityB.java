package me.timlampen.classes;

import java.awt.Graphics;
import java.awt.Rectangle;
public interface EntityB {
	
	public void tick();
	public void render(Graphics g);
	
	
	public double getY();
	public double getX();
	
	public Rectangle getBounds();
}
