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

		

		while(JOptionPane.showConfirmDialog(null, "Pense em um animal", "Jogo", JOptionPane.YES_NO_OPTION) == 0){

			tree.setCurrent(root);
			tree.setPreviews(null);
		
			int answer = 2;

			
			while(true){
				if(tree.getPreviews()!=null)
				    System.out.println("PREVIEWS: " + tree.getPreviews().getAnimal().getName());

				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + tree.getCurrent().getAnimal().getAction()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION)==0){

					if(lastNode(root,tree,AnimalsTree.LEFT) || justLeftEmpty(root,tree)){

						isAnimal(tree,AnimalsTree.LEFT);
						break;

					}else{
						
						if(tree.getCurrent().getLeft()!=null){
							
						    tree.setPreviews(tree.getCurrent());
							
							tree.setCurrent(tree.getCurrent().getLeft());
						}	
						
						
					}
						
					answer=0;

				}else{
					
					
					if(lastNode(root,tree,AnimalsTree.RIGHT) || justRightEmpty(root,tree)){

						isAnimal(tree,AnimalsTree.RIGHT);
						break;
						
					}else{
						
						if(tree.getCurrent().getRight()!=null){
							if(answer!=1)
							     tree.setPreviews(tree.getCurrent());
						    tree.setCurrent(tree.getCurrent().getRight());
						
						}

					}
					
					answer = 1;
					
				}


			}



		}



	}
	
	//node esquedo null
	private static boolean justLeftEmpty(Node root, AnimalsTree tree){
		
		return tree.getCurrent().getLeft()==null;
	}
	
	//node direito null
	private static boolean justRightEmpty(Node root, AnimalsTree tree){
		
		return tree.getCurrent().getRight()==null;
	}

	
	//define folha, respeitando a particularidade dos nodes iniciais Tubarão e Macaco
	private static boolean lastNode(Node root, AnimalsTree tree,boolean leftRight){

		boolean leaf;

		leaf = tree.getCurrent().getLeft()==null && tree.getCurrent().getRight()==null;

		
		if(root == tree.getCurrent() && leftRight){
			leaf = tree.getCurrent().getLeft()==null;
		}

		if(root == tree.getCurrent() && !leftRight){
			tree.setCurrent(root.getRight());	
			tree.setPreviews(root.getRight());
			leaf = tree.getCurrent().getRight()==null && tree.getCurrent().getLeft()==null;
		}
		
		return leaf;

	}


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


