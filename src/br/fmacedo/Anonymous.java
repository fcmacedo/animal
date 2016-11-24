package br.fmacedo;

public class Anonymous extends Animal {
	
	public Anonymous() {
	
	}
	
	Anonymous(String name, String action, boolean isLiveWater){
		super(name, action, isLiveWater);
	}
	
	@Override
	public void _action() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
