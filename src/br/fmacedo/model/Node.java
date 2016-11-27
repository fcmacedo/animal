package br.fmacedo.model;

public class Node {

	private Node right;
	private Node left;
	private Animal animal;
	
	public Node(String nome, String action){
		this.animal = new Animal(nome,action);
	}
	
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
