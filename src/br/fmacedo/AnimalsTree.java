package br.fmacedo;

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
	    
	    
	    public Animal getAnimal(){
	    	return getAnimal(this.root);
	    }
	    
	    


		public Animal getAnimal(Animal root){
		    if(root == null){
		        return null;
		    }
		    getAnimal(root.getAnimalLeft());
		   
		    
		    return getAnimal(root.getAnimalRight());
		    
		    
		    
		}
	  
	    
	    
	  

	
}
