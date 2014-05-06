import java.io.*;
import java.util.*;
import java.lang.Integer;

public class serviceLane{
	public static void main(String args[]){
		Scanner myScan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(myScan.hasNextLine()){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			String line = myScan.nextLine();
			String[] s = line.split(" ");
			for(int i = 0; i<s.length; i++){
				temp.add(Integer.parseInt(s[i]));
			}
			
			input.add(temp);
		}
	//	System.out.println(input.toString());


		int ans[];
		ans = new int[Integer.valueOf(input.get(0).get(1))];
	//	System.out.println(ans.length);
		for (int i=0; i<ans.length; i++){
			int start = Integer.valueOf(input.get(i+2).get(0));
			int end = Integer.valueOf(input.get(i+2).get(1));
			int car = 3;
			for(int j = start; j<=end; j++){
				
				if(car > Integer.valueOf(input.get(1).get(j)))
					car = Integer.valueOf(input.get(1).get(j));
			}
			ans[i]=car;
			System.out.println(ans[i]);
		}
	}
}