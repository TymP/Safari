
public class Game {

	/**
	 * @param args
	 */
	public void play(){
		UI ui = new UI();
		BinaryTree theTree= new BinaryTree();
		theTree.addNode(20, "Does it have a backbone?");
		theTree.addNode(10,"Is it a horse?");
		theTree.addNode(30, "Is it an octopus");
		//Create a randomiser to choose a random question.
		boolean playing = true;
		while(playing){
			Node current = theTree.findNode(20);
			while(current.isLeaf() ==false){
				System.out.println(current.name);
				if(ui.gotYes()){
					current = current.leftChild;
				}
				else{
					current = current.rightChild;
				}
			}
			System.out.println("Is it "+current.name + " ?");
			if(ui.gotYes()){
				System.out.println("I win.");
				playing = ui.keepPlaying();
			}
			else{
				System.out.println("I give up, what is it?");
				String animal = ui.getInput();
				System.out.println("Type a question that distinguishes " + current.name + " from " + animal);
				String question = ui.getInput();
				System.out.println("What's the answer for " + animal + " ?");
				boolean answer = ui.gotYes();//Getting invalid input prompt
				if(answer){
					current.leftChild = new Node(current.key -1,animal);
					current.rightChild = new Node(current.key +1, current.name);
				}
				else{
					current.leftChild = new Node(current.key -1,current.name);
					current.rightChild = new Node(current.key +1, animal);
				}
				
				current.setName(question);
				
				
			}
		}
	}
}

