import java.util.Scanner;

public class PE_8 {
	public static void main(String[] args) {
		int input,x;
		Scanner s = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		System.out.println("Enter number");
		input = s.nextInt();
		
		do {
			System.out.println("Give number");
			x=y.nextInt();
			if(x>input)
				System.out.println("number is less than entered");
			if(x<input)
				System.out.println("number is greater than input");
			if(x==input)
				System.out.println("Matched");
				}while(x!=input);
	}

}
