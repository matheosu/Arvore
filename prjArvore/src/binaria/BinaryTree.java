package binaria;

public class BinaryTree<E> {

	private NodeTree<E> root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public void add(E element){
		if(isEmpty()){
			this.root = createNode(element);
		}else{
			
		}
	}
	
	/**
	 * Criar um nó sem filho apenas com a informação (elemento)
	 * @param element
	 * @return o novo nó;
	 * @author matheuscastro
	 */
	public NodeTree<E> createNode(E element){
		return new NodeTree<E>(element);
	}
	
	/**
	 * Cria um nó com os dois filhos, esquerda e direita, e a informação (elemento);
	 * @param element
	 * @param left
	 * @param right
	 * @return
	 * @author matheuscastro;
	 */
	public NodeTree<E> createNode(E element, NodeTree<E> left, NodeTree<E> right){
		return new NodeTree<E>(element,left,right);
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}
	
	private boolean nodeEmpty(NodeTree<E> node){
		return node == null;
	}
	
	public boolean containElement(E element, NodeTree<E> node){
		if(nodeEmpty(node))
			return false;
		
		return element == node.getElement() || containElement(element, node.getLeft()) || containElement(element, node.getRight());
	}
	
	@Override
	public String toString(){
		return "";
	}
	
	public void nodeTreeString(NodeTree<E> node){
		if(!nodeEmpty(node)){
			System.out.println(node.getElement() + " - ");
			nodeTreeString(node.getLeft());
			nodeTreeString(node.getRight());
		}
	}
	
}
