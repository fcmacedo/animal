package br.fmacedo;

import javax.swing.JOptionPane;

public class AnimalsTree {

	 private Animal root;

	    public boolean isEmpty(){
	        if(root == null){
	            return true;
	        }
	        return false;
	    }
	    
	    public void printTree(){
	        if(this.root == null)
	            System.out.println("Árvore vazia");
	        else
	        	printTree(this.root);
	    }
	    
	    private void printTree(Animal Animal){
	        if(Animal.getAnimalLeft() != null){
	        	printTree(Animal.getAnimalLeft());
	        }
	        if (Animal.getAnimalRight() != null){
	        	printTree(Animal.getAnimalRight());
	        }
	        System.out.println("Nó: " + Animal.getName());
	    }
	    
	    
	    
	    public void insert(String name, String action){
	    	insert(this.root, name,action);
	    }
	    
	    public void insert(Animal Animal, String name, String action) {
	        if(this.root == null){
	           
	            this.root = new Animal(name,action);

	       
	        } else {
	            
	        	if (action.equalsIgnoreCase(Animal.getAction())) {
	                
	        		if (Animal.getAnimalLeft() != null) { 
	                	insert(Animal.getAnimalLeft(), name,action); 
	                } else { 
	                    //Se nodo esquerdo vazio insere o novo no aqui 
	                    Animal.setAnimalLeft(new Animal(name,action)); 
	                } 
	        		
	                //Verifica se o valor a ser inserido é maior que o no corrente da árvore, se sim vai para subarvore direita 
	            }else{ 
	                //Se tiver elemento no no direito continua a busca 
	                if (Animal.getAnimalRight() != null) { 
	                	insert(Animal.getAnimalRight(), name,action); 
	                } else {
	                    //Se nodo direito vazio insere o novo no aqui 
	                    Animal.setAnimalRight(new Animal(name,action)); 
	                } 
	            }
	        }
	    }
	    
	    public void prefixado() {
	    	prefixado(this.root);
	    }
	    
	    public boolean prefixado(Animal no) {
	        if(no != null){
	            if(no.getAnimalRight()==null && no.getAnimalLeft()==null){
	            	
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
	            			prefixado(no.getAnimalLeft());	
	            	}else{		
	            			prefixado(no.getAnimalRight());
	            	}		
	            	
	            }
	        	
	        	System.out.print(no.getName() + " ");
	            
	            
	        }
	        return false;
	    }
	    
	  

	
}
