
import java.util.Scanner;
public class PE_3 {
	public static void main(String[] args) {

	String word;
	int i;

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter word");
	word = input.nextLine();
	String[] s = word.split("");
	int n=s.length;
	for(i=0;i<n;i++)
	{
		if (s[i].charAt(0)=='a' || s[i].charAt(0)=='e' || s[i].charAt(0)=='i' || s[i].charAt(0)=='o' || s[i].charAt(0)=='u') 
		System.out.print("Vowel\t");
		else
			System.out.print("Consonant\t");
		
	}
	}
	}
	