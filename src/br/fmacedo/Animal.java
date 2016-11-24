package br.fmacedo;

public class Animal {

	
	
	protected String name;
	protected String action;
	protected Animal animalLeft;
	protected Animal animalRight;
	
		
	Animal(){
	}
	
	Animal(String name, String action){
		this.name = name;
		this.action = action;
	}
		

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Animal getAnimalLeft() {
		return animalLeft;
	}

	public void setAnimalLeft(Animal animalWater) {
		this.animalLeft = animalWater;
	}

	public Animal getAnimalRight() {
		return animalRight;
	}

	public void setAnimalRight(Animal animalTerrain) {
		this.animalRight = animalTerrain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
