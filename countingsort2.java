import java.util.*;

public class countingsort2{
	public static void main(String[] args){
		Scanner myscan = new Scanner(System.in);
		int n = myscan.nextInt();
		int[] count = new int[100]; 
		for (int i=0; i<n; i++){
			int temp = myscan.nextInt();
			count[temp]++;
		}

		//System.out.println(Arrays.toString(count));
		int[] output = new int[n];
		int j=0;
		for(int i=0; i<100; i++){
			while(count[i]>0){
				output[j] = i;
				count[i]--;
				j++;
			}
		}
		System.out.println(Arrays.toString(output).replace("[","").replace("]","").replace(",",""));

	}
}