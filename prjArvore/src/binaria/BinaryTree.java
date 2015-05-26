package binaria;

public class BinaryTree<E> {

	private NodeTree<E> root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	/**
	 * Criar um n� sem filho apenas com a informa��o (elemento)
	 * @param element
	 * @return o novo n�;
	 * @author matheuscastro
	 */
	public NodeTree<E> createNode(E element){
		return new NodeTree<E>(element);
	}
	
	/**
	 * Cria um n� com os dois filhos, esquerda e direita, e a informa��o (elemento);
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
