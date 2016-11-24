package br.fmacedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Evaluation {


	public static boolean eval(ArrayList<Animal> list){
		
		int i=1;
		
		if(list.size() == 1 )
		
			if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é um Tubarão?", "Desisto", JOptionPane.YES_NO_OPTION) == 0){
	
				JOptionPane.showMessageDialog(null, "Acertei de novo", "JogoDosAnimais", JOptionPane.OK_OPTION);
				return true;
				
			}	
		
		while(i < list.size()){
			
			if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + list.get(i).getAction(), "Desisto", JOptionPane.YES_NO_OPTION) == 0){

				
				
			}	
			
			i++;
			
		}
		

			
		return false;
	}
	
	
}
