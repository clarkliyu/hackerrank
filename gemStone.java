import java.util.*;

public class gemStone{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int n = Integer.parseInt(myScan.nextLine());
		TreeSet<Character> output = new TreeSet<Character>();
		String first = myScan.nextLine();
		for (int i=0; i<first.length(); i++){
			output.add(first.charAt(i));
		}

		for(int i=0; i<n-1; i++){
			TreeSet<Character> temp = new TreeSet<Character>();
			String s = myScan.nextLine();
			for(int j=0; j<s.length(); j++){
				temp.add(s.charAt(j));
			}
			output.retainAll(temp);
		}
		System.out.println(output.size());
	}
}