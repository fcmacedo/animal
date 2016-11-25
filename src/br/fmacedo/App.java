package br.fmacedo;


import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pense em um animal:");

		AnimalsTree tree = new AnimalsTree();

		Animal animal;

		//tree.insert("Raiz", null);
		tree.insert("Tubarao","vive na agua",AnimalsTree.LEFT);
		tree.insert("Macaco","vive na terra",AnimalsTree.RIGHT);

		Node root = tree.getRoot();

		System.out.println(root.getAnimal().getName());

		boolean nodeLeaf,side=true;

		while(true){

			tree.setRoot(root);

			//System.out.println("saiu laço interior");

			while(tree.getRoot()!=null){


				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou "+ tree.getRoot().getAnimal().getAction() +"?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){


					side = AnimalsTree.LEFT;


				}else{

					side = AnimalsTree.RIGHT;

				}


				nodeLeaf = isLeaf(root,tree,side);


				if(nodeLeaf){

					if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + tree.getRoot().getAnimal().getName()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){

						JOptionPane.showMessageDialog(null, "Acertei de novo!");
						break;



					}else{
						String name = JOptionPane.showInputDialog(null, "Qual animal você pensou?");
						String action = JOptionPane.showInputDialog(null, "Um(a) " + name + " _______ mas um " + tree.getRoot().getAnimal().getName()+ " não!");
						tree.insert(tree.getRoot(),name,action,side);
						break;
					}	


				}else{

					if(side){
						if(tree.getRoot().getLeft()!=null)
							tree.setRoot(tree.getRoot().getLeft());
					}else{
						if(tree.getRoot().getRight()!=null)
							tree.setRoot(tree.getRoot().getRight());
					}

				}



			}


		}




	}

	private static boolean isLeaf(Node root, AnimalsTree tree, boolean side){

		boolean folha;

		folha = tree.getRoot().getLeft()==null && tree.getRoot().getRight()==null;

		if(root == tree.getRoot() && side){
			folha = tree.getRoot().getLeft()==null;
		}

		if(root == tree.getRoot() && !side){
			tree.setRoot(tree.getRoot().getRight());		
			folha = tree.getRoot().getRight()==null && tree.getRoot().getLeft()==null;
		}

		return folha;
	}

}


