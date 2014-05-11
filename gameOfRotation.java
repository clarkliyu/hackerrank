import java.util.*;

public class gameOfRotation{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int n = myScan.nextInt();
		long[] input = new long[n];
		for(int i=0; i<n; i++){
			input[i] = myScan.nextInt();
		}
		long output = 0;
		for(int i=1; i<n+1; i++){
			output = output + i*input[i-1];
		}
		long temp=output;
		long sum = 0;
		for(int i=0; i<n; i++){
			sum += input[i];
		}
		for(int i=0; i<n; i++){
			temp = temp - sum + n*input[i];
			if(output<temp)
				output = temp;

		}

		System.out.println(output);
	}
}