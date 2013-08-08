package implementBinaryTree;

class Node{
	int data;
	Node leftNode;
	Node rightNode;
	
	public Node(int _data){
		data = _data;
		leftNode = null;
		rightNode = null;
	}
}

class MyBinaryTree{
	Node root;
	
	public MyBinaryTree(){
		root = null;
	}
	
	public void addNode(Node n){
		if(root == null){
			root = n;
		}
		else{
			//where to insert node?
			//traverse the tree.
			Node insertNode = root;
			boolean inserted = false;
			while(!inserted){
				if(n.data < insertNode.data){
					if(insertNode.leftNode == null){
						insertNode.leftNode = n;
						inserted = true;
					}
					else{
						insertNode = insertNode.leftNode;
					}
				}
				else{
					//data > insertNode
					if(insertNode.rightNode == null){
						insertNode.rightNode = n;
						inserted = true;
					}
					else{
						insertNode = insertNode.rightNode;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node FocusNode){
		if(FocusNode !=null){
			inOrderTraversal(FocusNode.leftNode);
			System.out.print(FocusNode.data);
			System.out.print(" ");
			inOrderTraversal(FocusNode.rightNode);
		}
	}
	
	public void postOrderTraversal(Node FocusNode){
		if(FocusNode !=null){
			postOrderTraversal(FocusNode.leftNode);
			postOrderTraversal(FocusNode.rightNode);
			System.out.print(FocusNode.data);
			System.out.print(" ");
		}
	}
	
	public void preOrderTraversal(Node FocusNode){
		if(FocusNode !=null){
			System.out.print(FocusNode.data);
			System.out.print(" ");
			preOrderTraversal(FocusNode.leftNode);
			preOrderTraversal(FocusNode.rightNode);
		}
	}
}

public class ImplementBinaryTree {

	public static void main(String[] args) {
		MyBinaryTree bt = new MyBinaryTree();
		
		bt.addNode(new Node(5));
		bt.addNode(new Node(3));
		bt.addNode(new Node(1));
		bt.addNode(new Node(4));
		bt.addNode(new Node(2));
		bt.preOrderTraversal(bt.root);
	}

}
