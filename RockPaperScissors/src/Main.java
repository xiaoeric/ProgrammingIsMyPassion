import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		do {
			String sentence = input.nextLine();
			if(sentence.equals("end")) {
				break;
			}
			System.out.print(check(sentence));
			System.out.println();
		} while(true);
	}
	
	public static String check(String userPick){
		if(userPick.equals("jesus")){
			return "HALLELUJAH YOU WIN GOD BLESS";
		}
		
		int rand = (int)(Math.random() * 3);
		String programChoice;
		if(rand == 0){
			programChoice = "rock";
		} else if(rand == 1){
			programChoice = "paper";
		} else {
			programChoice = "scissors";
		}
		
		if(userPick.equals(programChoice)){
			return "The program chose " + programChoice + ". You tied";
		} else if((userPick.equals("rock") && programChoice.equals("paper"))
				||(userPick.equals("paper") && programChoice.equals("scissors"))
				||(userPick.equals("scissors") && programChoice.equals("rock"))) {
			return "The program chose " + programChoice + ". You lose";
		} else if((userPick.equals("paper") && programChoice.equals("rock"))
				||(userPick.equals("scissors") && programChoice.equals("paper"))
				||(userPick.equals("rock") && programChoice.equals("scissors"))) {
			return "The program chose " + programChoice + ". You win";
		} else {
			return "bruh";
		}
	}
}
