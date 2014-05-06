import java.util.*;

public class Solution{
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		int t = myScan.nextInt();
		for(int i=0; i<t; i++){
			int n = myScan.nextInt();
			int temp = n/3;
			StringBuilder str = new StringBuilder();
			while(temp>=0){
				if((n-temp*3)%5==0){
					for(int j=0; j<temp; j++){
						str.append("555");
					}
					for(int j=0; j<(n-temp*3)/5; j++){
						str.append("33333");
					}
					System.out.println(str);
					break;
				}
				temp--;
				
			}
			if(temp==-1)
				System.out.println("-1");

		}
	}
}