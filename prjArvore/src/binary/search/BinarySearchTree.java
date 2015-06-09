package binary.search;

public class BinarySearchTree<E extends Comparable<? super E>> {

	private NodeTree<E> root;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public void add(E element){
		NodeTree<E> newNode = new NodeTree<E>(element);
		
		if(isEmpty()){
			root = newNode;
		}else{
			add(this.root, newNode);
		}
	}
	
	private void add(NodeTree<E> root, NodeTree<E> newNode){
		if(newNode.getElement().compareTo(root.getElement()) < 0){ // o elemento é menor que a raiz
			if(root.isLeaf() || root.getLeft()==null){ // a raiz é folha ou tem espaço no lado esquerdo 
				root.setLeft(newNode);
			}else{
				add(root.getLeft(), newNode);
			}
		} else if(newNode.getElement().compareTo(root.getElement()) > 0){ // o elemento é maior que a raiz
			if(root.isLeaf() || root.getRight()==null){ // a raiz é folha ou tem espaço no lado direito 
				root.setRight(newNode);
			}else{
				add(root.getRight(),newNode);
			}
		} 
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}
	
	public boolean containElement(E element, NodeTree<E> node){
		if(node == null)
			return false;
		
		return element == node.getElement() || containElement(element, node.getLeft()) || containElement(element, node.getRight());
	}
	
	public void preOrderPrint(NodeTree<E> node) {
		if (node!=null) {
			System.out.print(node + " - ");
			preOrderPrint(node.getLeft());
			preOrderPrint(node.getRight());
		}
	}

	public void inOrderPrint(NodeTree<E> node) {
		if (node!=null) {
			inOrderPrint(node.getLeft());
			System.out.print(node + " - ");
			inOrderPrint(node.getRight());
		}
	}

	public void postOrderPrint(NodeTree<E> node) {
		if (node!=null) {
			postOrderPrint(node.getLeft());
			postOrderPrint(node.getRight());
			System.out.print(node + " - ");
		}
	}
	
	public NodeTree<E> getRoot() {
		return root;
	}

	@Override
	public String toString() {
		return "BinarySearchTree";
	}
	
}
