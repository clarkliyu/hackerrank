import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class game{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();

		String ans = "YES";
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		for(int i=0; i<inputString.length(); i++){
			char c = inputString.charAt(i);
			Integer val = table.get(c);
			if(val != null){
				table.put(c, val+1);
			}
			else{
				table.put(c,1);
			}
			
		}
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>(table.values());
		int size = arr.size();
		for (int j=0; j<size; j++){
			int temp = arr.get(j).intValue();
			if (temp%2 != 0)
				count++;
			if (count > 1){
				ans = "NO";
				break;
			}
				
		}
		System.out.println("Arraylist contains: " + arr.toString()); 
		// Enumeration e = table.elements();
		// while (e.hasMoreElements()){
		// 	System.out.println(e.nextElement());
		// 	if (e.nextElement%2 != 0)
		// 		count++;
		// 	if (count > 1)
		// 		ans = "NO";
		// 	break;
		// }
		System.out.println(ans);
		myScan.close();
	}
}