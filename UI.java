import java.util.Scanner;
public class UI {
	
	private Scanner sc=null;
	
	public UI(){
		sc = new Scanner(System.in);
	}
	/**
	 * @param args
	 */
	public boolean gotYes(){
		String input = "error";
		boolean again = true;
		while(again){
			try{
				input = sc.nextLine().toLowerCase();
				again = false;
				if(!input.equals("yes") && !input.equals("no")){
					again=true;
					System.out.println("Invalid, input yes or no.");
					System.out.println("your input was: " + input);
				}
			}
			catch(Exception InputMismatchException){
				System.out.println("Invalid input, try again.");
			}
		}
		return input.equals("yes");
	}
	
	public boolean keepPlaying(){
		System.out.println("Do you want to keep playing?");
		return gotYes();
	}
	
	public String getInput(){
		String result = "error";
		boolean again = true;
		while(again){
			try{
				result = sc.nextLine();
				again = false;
			}
			catch(Exception InputMismatchException){
				System.out.println("Invalid input, try again.");
			}
		}
		return result;
	}

}
