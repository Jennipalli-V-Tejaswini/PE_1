import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PE_7 {
	public static void main(String[] args) {

		String anArray;

		int i,count=0;
		int sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number");
		anArray = s.nextLine();
		Array[] strArray = anArray.split("");
		Array.sort(strArray);

}
}
