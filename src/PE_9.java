import java.util.Scanner;

public class PE_9 {
	public static void main(String[] args) {

		String anArray;

		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string");
		anArray = s.nextLine();
		String[] strArray = anArray.split("");
		int n=strArray.length;
		for(i=0;i<n;i++)
			System.out.print(strArray[n-1-i]);
			

}
}