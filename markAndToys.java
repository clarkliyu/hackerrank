import java.util.*;

public class markAndToys{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int n = myScan.nextInt();
		int k = myScan.nextInt();
		int[] price = new int[n];
		for(int i=0; i<n; i++){
			price[i] = myScan.nextInt();
		}
		Arrays.sort(price);
		int total=0;
		int answer=0;
		for(answer=0; answer<n; answer++){
			if(total+price[answer]>k)
				break;
			else
				total += price[answer];

		}
		System.out.println(answer);
	}
}