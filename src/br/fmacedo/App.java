package br.fmacedo;


import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pense em um animal:");
		
		AnimalsTree tree = new AnimalsTree();
		
				

		Animal animal;
		
		if(JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
			
			if(tree.isEmpty())
			    tree.insert("Tubarao",null);
			
			//percorrer a árvore
			while((animal = tree.getAnimal().getAnimalLeft()) == null){
				
				System.out.println("É o " + animal.getName() + "?");
				
				
				
			}
			
		}else{
			
			if(tree.isEmpty())
			    tree.insert("Macaco",null);
			
		}
		
		
		
		//percorrer a árvore
		while(tree.getAnimal().getAnimalLeft() == null){
			
			
			
			
			
		}
		
		
		
	}
	
	
	

}
