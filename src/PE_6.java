import java.util.Scanner;

public class PE_6 {
	public static void main(String[] args) {
char character;
Scanner input = new Scanner(System.in);
	
	System.out.println("Enter character");
	character =input.findInLine(".").charAt(0);
	
	if (character>=65 && character<=90)
		System.out.println("Cap");
	if (character>=97 && character<=122)
		System.out.println("Lit");
	if (character>=48 && character<=57)
		System.out.println("Num");
	if((character>=0 && character<=47)|| (character>=58 && character<=64)||(character>=91 && character<=96)||(character>=123 && character<=127))
		System.out.println("Spe char");
	
	
}
}
