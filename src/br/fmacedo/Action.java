package br.fmacedo;

import java.util.ArrayList;

public class Action {

	private String action;
	private ArrayList <Animal> animal = new ArrayList<Animal>();

	
	Action(){
	}
	
	
	Action(String action, Animal animal){
		this.action = action;
		this.animal.add(animal);
	}
	
}
