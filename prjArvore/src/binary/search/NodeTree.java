package binary.search;

public class NodeTree<E>{

	private E element;
	private NodeTree<E> left;
	private NodeTree<E> right;
	
	public NodeTree(){}
	
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

	public boolean isLeaf(){
		return this.left == null && this.right == null;
	}
	
	@Override
	public String toString() {
		return "NodeTree [" + element + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((element == null) ? 0 : element.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeTree<?> other = (NodeTree<?>) obj;
		if (element == null) {
			if (other.element != null)
				return false;
		} else if (!element.equals(other.element))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}
	
	
}
