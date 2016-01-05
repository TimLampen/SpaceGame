package me.timlampen.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import me.timlampen.classes.EntityA;
import me.timlampen.classes.EntityB;
import me.timlampen.classes.EntityC;

public class Controller {
	
	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	private LinkedList<EntityC> ec = new LinkedList<EntityC>();
	
	
	EntityA enta;
	EntityB entb;
	EntityC entc;
	
	Random r = new Random();
	private Game game;
	
	private Textures tex;
	public Controller(Textures tex, Game game){
		this.tex = tex;
		this.game = game;
	}
	
	public void tick(){
		//a class
		for(int i=0;i< ea.size();i++ ){
			enta = ea.get(i);
			
			enta.tick();
		}
		//b class
		for(int i=0;i< eb.size();i++ ){
			entb = eb.get(i);
			
			entb.tick();
		}
		//c class
		for(int i=0;i< ec.size();i++ ){
			entc = ec.get(i);
			
			entc.tick();
		}
	}
	
	public void createEnemy(int enemy_count){
		for(int i = 0; i <= enemy_count; i++){
			addEntity(new Enemy(r.nextInt(640)+1, -10, tex, game, this));
		}
	}
	public void createPowerup(int power_count){
		for(int i = 0; i <= power_count; i++){
			addEntity(new Powerup(r.nextInt(640)+1, -10, tex, game, this));
		}
	}
	
	public void render(Graphics g){
		//a class
		for(int i=0;i< ea.size();i++ ){
			enta = ea.get(i);
			
			enta.render(g);
		}
		//b class
		for(int i=0;i< eb.size();i++ ){
			entb = eb.get(i);
			
			entb.render(g);
		}
		//c class
		for(int i=0;i< ec.size();i++ ){
			entc = ec.get(i);
			
			entc.render(g);
		}
	}
	
	public void addEntity(EntityA block){
		ea.add(block);
	}
	
	public void removeEntity(EntityA block){
		ea.remove(block);
	}
	public void addEntity(EntityB block){
		eb.add(block);
	}
	
	public void removeEntity(EntityB block){
		eb.remove(block);
	}
	public void addEntity(EntityC block){
		ec.add(block);
	}
	
	public void removeEntity(EntityC block){
		ec.remove(block);
	}
	
	public LinkedList<EntityA> getEntityA(){
		return ea;
	}
	public LinkedList<EntityB> getEntityB(){
		return eb;
	}
	public LinkedList<EntityC> getEntityC(){
		return ec;
	}
}
