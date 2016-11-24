package br.fmacedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pense em um animal:");
		
		ArrayList  <Animal> listWater= new ArrayList<Animal>();
		ArrayList  <Animal> listTerrain= new ArrayList<Animal>();
		
		listWater.add(new AnimalWater("Tubarao",null,true));
		listTerrain.add(new AnimalTerrain("Macaco",null,false));
		
		if(JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){
			//agua
			Evaluation.eval(listWater);
			
			
			
		}else{
			//terra
			Evaluation.eval(listTerrain);
			
		}
		
	}
	
	
	

}
