import java.util.*;

public class closestNumbers{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int n = myScan.nextInt();
		int[] input = new int[n];
		for(int i=0; i<n; i++){
			input[i] = myScan.nextInt();
		}

		Arrays.sort(input);
		int smallest = input[1]-input[0];
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0; i<n-1; i++){
			if(input[i+1]-input[i]<smallest){
				smallest = input[i+1]-input[i];
				res.clear();
				res.add(input[i]);
				res.add(input[i+1]);
			}
			else if(input[i+1]-input[i]==smallest){
				res.add(input[i]);
				res.add(input[i+1]);
			}
		}

		System.out.println(res.toString().replaceAll("\\[","").replaceAll("\\]","").replaceAll(",",""));
	}
}