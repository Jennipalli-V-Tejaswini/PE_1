import java.util.Scanner;

public class PE_2 {
	public static void main(String[] args) {

	int i;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number");
	
	int num = in.nextInt();
	if(num>=20 && num<=30)
	{
	if(num%2==1)
		System.out.println("Tom");
	else
		System.out.println("Jerry");
	}
		
}

}