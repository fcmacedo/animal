package br.fmacedo;

public abstract class Animal {

	
	protected String name;
	protected boolean isLiveWater;
	protected Action action;
	
	
	Animal(){
	}
	
	Animal(String name, String action, boolean isLiveWater){
		this.name = name;
		this.action = new Action(action,this);
		this.isLiveWater = isLiveWater;
	}
	
	
	public boolean isLiveWater() {
		return isLiveWater;
	}

	public void setLiveWater(boolean isLiveWater) {
		this.isLiveWater = isLiveWater;
	}

	public abstract void _action();
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
