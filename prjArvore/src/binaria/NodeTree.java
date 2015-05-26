package binaria;

public class NodeTree<E> {

	private E element;
	private NodeTree<E> left;
	private NodeTree<E> right;
	
	public NodeTree(){
		super();
	}
	
	public NodeTree(E element){
		this.setElement(element);
	}

	public NodeTree(E element, NodeTree<E> left, NodeTree<E> right){
		this.setElement(element);
		this.setLeft(left);
		this.setRight(right);
	}
	
	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public NodeTree<E> getLeft() {
		return left;
	}

	public void setLeft(NodeTree<E> left) {
		this.left = left;
	}

	public NodeTree<E> getRight() {
		return right;
	}

	public void setRight(NodeTree<E> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "NodeTree [" + element + "]";
	}
	
}
