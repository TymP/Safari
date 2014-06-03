
public class BinaryTree {

	Node root;
	
	public void addNode(int key, String name){
		Node newNode = new Node(key,name);
		
		if(root==null){
			root = newNode;
		}
		
		else{
			Node focusNode = root;
			Node parent;
			
			while(true)
			{
				parent = focusNode;
				if(key<focusNode.key){ //If our desired key is less than the current nodes key:
					//look at the left child
					focusNode=focusNode.leftChild;
					
					if(focusNode ==null){//If this child does not exist
						parent.leftChild =newNode; //the child is set equal to the desired node.
						return;
					}
				}
				
				else{
					focusNode = focusNode.rightChild;
					
					if(focusNode==null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
public void postOrderTraverseTree(Node focusNode){
		
		if(focusNode != null){
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
		
	}
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode !=null){
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightChild);
			return;
		}
	}
	
	public void preOrderTraverseTree(Node focusNode) {
		
		//first get the focus node.
		
		if(focusNode!=null){
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public Node findNode(int key){
		
		Node focusNode = root;
		while(focusNode.key!=key){
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}
			else{
				focusNode=focusNode.rightChild;
			}
			
			if(focusNode ==null){
				return null;
			}
		}
		return focusNode;
		
	}
	
}
