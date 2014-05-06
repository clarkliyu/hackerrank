import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		long n = myScan.nextInt();
		long c = myScan.nextInt();
		long total = 0;
		for (long i=0; i<c; i++){
			long a = myScan.nextInt();
			long b = myScan.nextInt();
			total = total + (b-a+1)*myScan.nextInt();
		}
		System.out.println(total/n);
	}

}