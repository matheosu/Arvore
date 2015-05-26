package binaria;

public class BinaryTree<E> {

	private NodeTree<E> root;
	
	public BinaryTree(){
		this.root = null;
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
	
	
	@Override
	public String toString(){
		return "";
	}
	
}
