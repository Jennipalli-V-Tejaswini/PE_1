import java.util.Scanner;

public class PE_4 {
	public static void main(String[] args) {
		int i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = in.nextInt();
		for(i=1;i<(num+1);i++) {
			for(j=1;j<(i+1);j++)
				System.out.print(i);
				
		}
        

}
}
