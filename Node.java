
public class Node {

	public int key;
	public String name;
	public Node leftChild;//yes
	public Node rightChild;//no
	

	public Node(int key, String name){
		this.key = key;
		this.name =name;
//		leftChild = null;
//		rightChild = null;

	}
	
	public String toString(){
		return name + " has a key " + key;
	}
	
	public int getKey(){
		return this.key;
	}
		
	public boolean isLeaf(){
		boolean result = false;
		if(leftChild == null && rightChild == null){
			result = true;
		}
		return result;
	}
	public void setName(String setter){
		this.name = setter;
		
	}
}
