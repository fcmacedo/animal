package br.fmacedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Evaluation {


	public static boolean eval(ArrayList<Animal> list){
		
		int i=0;
		
		boolean isWater = list.get(i).isLiveWater;
		
		while(i < list.size()){
		
			if(list.get(i).action == null){
			
				if(isWater){
				
					if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é um Tubarão?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){
			
						JOptionPane.showMessageDialog(null, "Acertei de novo", "JogoDosAnimais", JOptionPane.OK_OPTION);
						return true;
						
					}else{
						i++;
						continue;
					}
					
				}else{
					if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é um Macaco?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){
						
						JOptionPane.showMessageDialog(null, "Acertei de novo", "JogoDosAnimais", JOptionPane.OK_OPTION);
						return true;
						
					}else{
						i++;
						continue;
					}
					
				}
			}
			
			//não é o default (macaco e tubarao) e não é a primeira vez
				
		
			
			if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + list.get(i).getName()+ "?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){

				
				JOptionPane.showMessageDialog(null, "Acertei de novo", "JogoDosAnimais", JOptionPane.OK_OPTION);
				return true;

				
				
			}else{
				
				
				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + list.get(i).action + "?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){

					
					
				}
				
			}
			
			i++;
			
		}
		

			
		return false;
	}
	
	
}
