package br.fmacedo;

public class AnimalsTree {

	public static final boolean LEFT = true;
	public static final boolean RIGHT = false;
	private Node root;

	public Node getRoot() {
		return root;
	}

	
	public void setRoot(Node root) {
		this.root = root;
	}



	public boolean isEmpty(){
		if(root == null){
			return true;
		}
		return false;
	}


	public void insert(String name, String action, boolean left){
		insert(this.root, name,action,left);
	}

	public void insert(Node node, String name, String action, boolean left) {

		if(this.root == null){

			this.root = new Node(name,action);


		} else {

			if (left) {

				if (node.getLeft() != null) { 
					insert(node.getLeft(), name,action,left); 

				} else { 

					node.setLeft(new Node(name,action)); 
				} 


			}else{ 

				if (node.getRight() != null) { 
					insert(node.getRight(), name,action,left); 
				} else {

					node.setRight(new Node(name,action)); 
				} 
			}
		}

	}


	/*
	    public void prefixado() {
	    	prefixado(this.root);
	    }

	    public boolean prefixado(Animal no) {
	        if(no != null){
	            if(no.getRight()==null && no.getLeft()==null){

	            	if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + no.getName()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){

	            		return true;

	            	}else{
	            		String name = JOptionPane.showInputDialog(null, "Qual animal você pensou?");
	            		String action = JOptionPane.showInputDialog(null, "Um(a) " + name + " _____ mas um " + no.getName()+ "!");
	            		insert(no,name,action);
	            		return false;
	            	}

	            }else {
	            	if(JOptionPane.showConfirmDialog(null, "O animal que você pensou " + no.getAction()+ "?", "Nunca Desisto", JOptionPane.YES_NO_OPTION) == 0){
	            			prefixado(no.getLeft());	
	            	}else{		
	            			prefixado(no.getRight());
	            	}		

	            }

	        	System.out.print(no.getName() + " ");


	        }
	        return false;
	    }

	 */


}
