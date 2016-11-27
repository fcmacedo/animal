package br.fmacedo.util;

import br.fmacedo.model.Node;

public class AnimalsTree {

	public static final boolean LEFT = true;
	public static final boolean RIGHT = false;

	private Node previews;
	private Node current;


	public Node getPreviews() {
		return previews;
	}


	public void setPreviews(Node previews) {
		this.previews = previews;
	}


	public Node getCurrent() {
		return current;
	}


	public void setCurrent(Node current) {
		this.current = current;
	}


	public boolean isEmpty(){
		if(current == null){
			return true;
		}
		return false;
	}


	public void inicialize(){
		
		Node raiz = new Node("Tubarao","vive na agua");
		raiz.setRight(new Node("Macaco","vive na terra"));
		
		current = raiz;
		
	}
	
	
	//insere node na árvore
	public void insertNode(Node node , boolean left) {

			if(left){
				current.setLeft(node);

			}else{
				current.setRight(node);

			}
		

		
	}

	
	//node esquerdo null
	public boolean justLeftEmpty(){
		
		return current.getLeft()==null;
	}
	
	//node direito null
	public boolean justRightEmpty(){
		
		return current.getRight()==null;
	}

	
	//define folha, respeitando a particularidade dos nodes iniciais Tubarão e Macaco
	public boolean lastNode(Node root,boolean leftRight){

		boolean leaf;

		leaf = current.getLeft()==null && current.getRight()==null;

		
		if(root == current && leftRight){
			leaf = current.getLeft()==null;
		}

		if(root == current && !leftRight){
			current = root.getRight();	
			previews = root.getRight();
			leaf = current.getRight()==null && current.getLeft()==null;
		}
		
		return leaf;

	}
	

	public void printTree(){
		if(this.current == null)
			System.out.println("Empty");
		else
			printTree(this.current);
	}

	private void printTree(Node node){
		if(node.getLeft() != null){
			printTree(node.getLeft());
		}
		if (node.getRight() != null){
			printTree(node.getRight());
		}

		String left = "", right = "";
		if(node.getLeft()!=null){
			left = " Left: " +  node.getLeft().getAnimal().getName();
		}

		if(node.getRight()!=null){
			right = " Right: " +  node.getRight().getAnimal().getName();
		}

		System.out.println("Node: " + node.getAnimal().getName() + left + right);
	}




}
