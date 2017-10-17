

import java.util.Scanner;
public class PE_1 {
	public static void main(String[] args) {

	String anArray;

	int i,count=0;
	int sum=0;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter number");
	anArray = s.nextLine();
	String[] strArray = anArray.split("");
	int n=strArray.length;
	for(i=0;i<(n/2);i++) {
		if(strArray[i].charAt(0)==strArray[n-1-i].charAt(0)){
			count=1;
		}
			
		else {
			count=0;
			break;
		}
	}
		
	if(count==1) {
		System.out.print(anArray);
		System.out.print(" is a palindrome\t");
		for(i=0;i<n;i++) {
			int k=Character.getNumericValue(strArray[i].charAt(0));
			sum=(sum+k);
		}
		if(sum>25)
			System.out.print("and it's sum is greater than 25");
		else
			System.out.print("and it's sum is lesser than 25");
			}
	else {
		System.out.print(anArray);
		System.out.print("is not a palindrome\t");
		
	}	
		
}
}