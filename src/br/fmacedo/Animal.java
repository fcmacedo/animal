package br.fmacedo;

public class Animal {

	
	
	protected String name;
	protected String action;
		
		
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

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
