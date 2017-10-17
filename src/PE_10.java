import java.util.Scanner;

public class PE_10 {
	public static void main(String[] args) {

		String anArray;

		int i,number,j;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string");
		anArray = s.nextLine();
		String[] strArray = anArray.split("");
		int n=strArray.length;
		System.out.println("Enter number");
		number = s.nextInt();
		System.out.print(anArray);
		for(j=0;j<number;j++) {
		for(i=number;i<n;i++)
		{
			System.out.print(strArray[i]);
		}
		}
		

}
}
