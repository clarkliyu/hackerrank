import java.util.*;
import java.math.*;


public class Solution{
	public static void main(String args[]){
		Scanner newScan = new Scanner(System.in);
		long t = newScan.nextInt();
		for(int i=0; i<t; i++){
			System.out.println(Solve(newScan.nextInt(), newScan.nextInt(), newScan.nextInt()));
		}
	}

	private static long Solve(long n, long a, long b){
		long res = n/a;
        long x = n/a;
		while(x>=b){
			res = res + x/b;
            x = x%b+x/b;
			
		}
		return res;

	}
}