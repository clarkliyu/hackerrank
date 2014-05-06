import java.io.*;
import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		int n = Integer.parseInt(myScan.nextLine());
		long[] input;
		input = new long[n];
		int i=0;
		while(myScan.hasNextLine()){
			input[i] = Integer.parseInt(myScan.nextLine());
			i++;
		}
		long[] ans;
		ans = new long[input.length];
		for (i=0; i<n; i++){
			if(input[i]%2==0){
				ans[i] = input[i]/2 *input[i]/2;
			}
			else
				ans[i] = input[i]/2 * (input[i]/2 + 1);
			System.out.println(ans[i]);
		}

	}
}