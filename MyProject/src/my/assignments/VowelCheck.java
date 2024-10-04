package my.assignments;
import java.util.Scanner;
public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch =  scanner.next().charAt(0);
	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is a vowel.");
	                break;
	            default:
	                System.out.println(ch + " is not a vowel.");
	                break;
	        }
         scanner.close();
	}

	

}
