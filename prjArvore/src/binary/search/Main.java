package binary.search;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<String> arvore = new BinarySearchTree<String>();
		arvore.add("D");
		arvore.add("B");
		arvore.add("A");
		arvore.add("C");
		arvore.add("E");
		arvore.add("G");
		arvore.add("H");
		arvore.add("I");
		
		System.out.println(arvore.findNodeByElement("J"));
	}

}
