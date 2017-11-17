import java.util.Scanner;

public class MemeString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		do {
			String sentence = input.nextLine();
			if(sentence.equals("end")) {
				break;
			}
			System.out.print(toMeme(sentence));
			System.out.println();
		} while(true);
	}
	
	public static String toMeme(String input) {
		String[] words = input.split(" ");
		String[] memeWords = new String[words.length];
		for(int i = 0; i < words.length; i++) {
			String memeWord = "";
			boolean startWithCapital = (Math.random() * 10) < 3;
			for(int j = 0; j < words[i].length(); j++) {
				if(startWithCapital) {
					if(j % 2 == 0) {
						memeWord += Character.toUpperCase(words[i].charAt(j));
					} else {
						memeWord += Character.toLowerCase(words[i].charAt(j));
					}
				} else {
					if(j % 2 != 0) {
						memeWord += Character.toUpperCase(words[i].charAt(j));
					} else {
						memeWord += Character.toLowerCase(words[i].charAt(j));
					}
				}
			}
			memeWords[i] = memeWord;
		}
		String memeOutput = "";
		for(String word : memeWords) {
			memeOutput += word + " ";
		}
		return memeOutput;
	}
}
