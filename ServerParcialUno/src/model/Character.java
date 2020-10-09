package model;

import processing.core.PApplet;

public class Character {
	
	private PApplet app;
	private int posX;
	private int posY;
	private String name;
	private int r;
	private int g;
	private int b;
	private int rad;
	private int textPosX;
	private int textPosY;

	
	public Character(PApplet app, int posX, int posY, String name, int r, int g, int b, int rad) {
		super();
		this.app = app;
		this.posX = 275;
		this.posY = 275;
		this.name = name;
		this.r = r;
		this.g = g;
		this.b = b;
		this.rad = 50;
		this.textPosX = posX;
		this.textPosY = posY - 75;
	}
	
	public void paint() {
		
		app.fill(r,g,b);
		app.circle(posX, posY, rad);
		
		app.fill(255,255,255);
		app.text(name, textPosX, textPosY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}
	
	
	
	
}
