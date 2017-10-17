
	
	import java.util.*;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class dcsdc {
	
	public static void main(String[] args) {
		String fileName="ipl.csv";

		public String[] getHeaders(String a) {
			
			BufferedReader brTest = new BufferedReader(new FileReader(a));
			
			String text = brTest.readLine();
			// Stop. text is the first line.
			System.out.println(text);
			String[] strArray = text.split(",");
			System.out.println(strArray);
			return strArray;
	}

}
}