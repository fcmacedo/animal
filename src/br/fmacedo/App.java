package br.fmacedo;


import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pense em um animal:");
		
		AnimalsTree tree = new AnimalsTree();
		
		Animal animal;
		
		tree.insert("Tubarao","vive na agua",AnimalsTree.LEFT);
		tree.insert("Macaco","vive na terra",AnimalsTree.RIGHT);
		
		Node root = tree.getRoot();
		
		System.out.println(root.getAnimal().getName());
		
		
		
		while(true){
			
			tree.setRoot(root);
		
			while(tree.getRoot().getLeft()!=null || tree.getRoot().getRight()!=null){
			
				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou "+tree.getRoot().getAnimal().getAction()+"?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
									
					  //verifica se tem algum node abaixo no ramo esquerdo
					   if(tree.getRoot().getLeft()==null){
						   
			            	if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + tree.getRoot().getAnimal().getName()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
			            			
			            		JOptionPane.showMessageDialog(null, "Acertei de novo!");
			            		
			            	}else{
			            		
			            		String name = JOptionPane.showInputDialog(null, "Qual animal você pensou?");
			            		String action = JOptionPane.showInputDialog(null, "Um(a) " + name + " _____ mas um " + tree.getRoot().getAnimal().getName()+ "!");
			            		tree.insert(tree.getRoot(),name,action,AnimalsTree.LEFT);
			            		break;
			            		
			            	}
			            	
			            	
			            	
					   }else{
						   
						  tree.setRoot(tree.getRoot().getLeft());
						   
						   
					   }
					   			
				}else{
					
					  tree.setRoot(tree.getRoot().getRight());
					
					  //verifica se tem algum node abaixo no ramo direito
					   if(tree.getRoot().getRight()==null){
						   
			            	if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + tree.getRoot().getAnimal().getName()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
			            			
			            		JOptionPane.showMessageDialog(null, "Acertei de novo!");
			            		
			            	}else{
			            		
			            		String name = JOptionPane.showInputDialog(null, "Qual animal você pensou?");
			            		String action = JOptionPane.showInputDialog(null, "Um(a) " + name + " _____ mas um " + tree.getRoot().getAnimal().getName()+ "!");
			            		tree.insert(tree.getRoot(),name,action,AnimalsTree.RIGHT);
			            		break;
			            		
			            	}
			            	
			            	
			            	
					   }else{
						   
						  tree.setRoot(tree.getRoot().getRight());
					   
						   
					   }
				
					
					
					
				}
				
			}	
		}	
		
		/*
		//percorrer a árvore
		while(tree.getAnimal().getAnimalLeft() == null){
			
			
			
			
			
		}
		
		*/
		
	}
	
	
	

}
