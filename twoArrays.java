import java.util.*;
import java.util.Collections;

public class twoArrays{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int T = myScan.nextInt();
		for(int i = 0; i<T; i++){
			int n = myScan.nextInt();
			int k = myScan.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int j=0; j<n; j++){
				a[j] = myScan.nextInt();
			}
			for(int j=0; j<n; j++){
				b[j] = myScan.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);

			int c=0;
			for(c=0; c<n; c++){
				if(a[c]+b[n-c-1]<k){
					System.out.println("NO");
					break;
				}
				if(c==n-1)
					System.out.println("YES");
			}

		}
	}
}