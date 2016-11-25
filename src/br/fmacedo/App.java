package br.fmacedo;


import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pense em um animal:");
		
		AnimalsTree tree = new AnimalsTree();
		
		Animal animal;
		
		tree.insert("Tubarao","vive na agua");
		tree.insert("Macaco","vive na terra");
		
		while(true){
		
			//if(JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
				
			//	if(tree.isEmpty())
			//	    tree.insert("Tubarao","vive na agua");
					
				    tree.prefixado();
				
				
			//}else{
				
			//	if(tree.isEmpty())
			//	    tree.insert("Macaco","vive na terra");
			//    	tree.prefixado();
				
			//}
		}	
		
		/*
		//percorrer a árvore
		while(tree.getAnimal().getAnimalLeft() == null){
			
			
			
			
			
		}
		
		*/
		
	}
	
	
	

}
