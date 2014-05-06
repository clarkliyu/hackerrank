import java.io.*;
import java.util.*;

public class utopianTree{
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		int[] input;
		int size = Integer.parseInt(myScan.nextLine());
		input = new int[size];
		int i = 0;
		while(myScan.hasNextLine()){
			input[i]=Integer.parseInt(myScan.nextLine());
			i++;
		}
		System.out.println(Arrays.toString(input));
		int[] ans;
		ans = new int[size];
		for (int j=0; j<size; j++){
			int temp = 1;
			while(input[j]>0){
				temp = temp * 2;
				input[j]--;
				if(input[j]==0)
					break;
				temp = temp + 1;
				input[j]--;
			}
			ans[j]=temp;
			System.out.println(ans[j]);
		}

	}
}