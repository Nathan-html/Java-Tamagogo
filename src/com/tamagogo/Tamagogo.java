package com.tamagogo;

public class Tamagogo {
	private String name;
	private int life;
	private int hunger;
	private int sleep;
	
	public Tamagogo(String name, int life, int hunger, int sleep) {
		this.name = name;
		this.setLife(life);
		this.setHunger(hunger);
		this.setSleep(sleep);
	}

	public void toEat() {
		this.setLife(this.getLife()+2);
		this.setHunger(this.getHunger()+5);
		this.setSleep(this.getSleep()-8);
	}
	
	public void toSleep() {
		this.setLife(this.getLife()+5);
		this.setHunger(this.getHunger()+5);
		this.setSleep(this.getSleep()+10);
	}
	public void playSports() {
		this.setLife(this.getLife()-10);
		this.setHunger(this.getHunger()-15);
		this.setSleep(this.getSleep()-15);
	}
	
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}
}
