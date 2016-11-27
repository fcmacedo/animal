package br.fmacedo;


import javax.swing.JOptionPane;

import br.fmacedo.model.Node;
import br.fmacedo.util.AnimalsTree;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalsTree tree = new AnimalsTree();



		tree.inicialize();
		
		Node root = tree.getCurrent();

		

		while(JOptionPane.showConfirmDialog(null, "Pense em um animal", "Jogo dos Animais", JOptionPane.YES_NO_OPTION) == 0){

			tree.setCurrent(root);
			tree.setPreviews(null);
		

			
			while(true){
				

				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + tree.getCurrent().getAnimal().getAction()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION)==0){

					if(tree.lastNode(root,AnimalsTree.LEFT) || tree.justLeftEmpty()){

						isAnimal(tree,AnimalsTree.LEFT);
						break;

					}else{
						
						if(tree.getCurrent().getLeft()!=null){
							
						    tree.setPreviews(tree.getCurrent());
							tree.setCurrent(tree.getCurrent().getLeft());
						}	
						
						
					}
						
					

				}else{
					
					
					if(tree.lastNode(root,AnimalsTree.RIGHT) || tree.justRightEmpty()){

						isAnimal(tree,AnimalsTree.RIGHT);
						break;
						
					}else{
						
						if(tree.getCurrent().getRight()!=null){
							
						    tree.setCurrent(tree.getCurrent().getRight());
						
						}

					}
					
					
					
				}


			}



		}



	}
	


	//verifica se é o animal
	private static void isAnimal(AnimalsTree tree, boolean leftRight){

		String animal;
		if(leftRight){
			animal = tree.getCurrent().getAnimal().getName();
			
		}else{
			animal = tree.getPreviews().getAnimal().getName();
		}
		
		if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + animal + "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){

			JOptionPane.showMessageDialog(null, "Acertei de novo!");
			


		}else{
			
			String name = JOptionPane.showInputDialog(null, "Qual animal você pensou?");
			String action = JOptionPane.showInputDialog(null, "Um(a) " + name + " _______ mas um " + tree.getCurrent().getAnimal().getName()+ " não!");
			
			Node node = new Node(name,action);
			
			tree.insertNode(node,leftRight);

			
		}	


	}



}


