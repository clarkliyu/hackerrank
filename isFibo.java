import java.util.*;

public class isFibo{
	public static void main(String args[]){
		long input=0;
		Scanner myScan = new Scanner(System.in);
		int t = myScan.nextInt();
		for (int i=0; i<t; i++){
			long n = myScan.nextInt();

			if(fibo(n)==true)
				System.out.println("IsFibo");
			else
				System.out.println("IsNotFibo");
		}
	}

	private static boolean fibo(long n){
		long fib0 = 0;
		long fib1 = 1;
		long fibn = fib0 + fib1;
		while(fibn < n){
			fib0 = fib1;
			fib1 = fibn;
			fibn = fib0 + fib1;
		}
		if(fibn == n)
			return true;
		else
			return false;
	}
}