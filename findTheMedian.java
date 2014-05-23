import java.util.*;

public class findTheMedian{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int size = myScan.nextInt();
		int[] input = new int[size];
		for(int i=0; i<size; i++){
			input[i] = myScan.nextInt();
		}

		System.out.println(select(input, 0, input.length-1, input.length-1/2));

	}

	public static int select(int[] ar, int start, int end, int n){
		if(start==end)
			return ar[start];
		int p=start + (int)Math.floor(Math.random() * (end - start + 1));
		p = partition(ar, start, end);
		if(n==p)
			return ar[n];
		else if(n<p)
			return select(ar, start, p-1, n);
		else 
			return select(ar, p+1, end, n);

	}

	public static int partition(int[] ar, int start, int end) {
		List<Integer> greater= new ArrayList<Integer>();
		List<Integer> less = new ArrayList<Integer>();
		int p = start + (int)Math.floor(Math.random() * (end - start + 1));
		for(int i=start+1; i<end; i++){
			if(ar[i]>p){
				greater.add(ar[i]);
			}
			else{
				less.add(ar[i]);
			}
		}
		for(int i=0; i<less.size();i++){
			ar[start+i] = less.get(i);
		}
		ar[start+less.size()] = p;
		for(int i=0; i<greater.size(); i++){
			ar[start+i+less.size()+1] = greater.get(i);
		}
		int mid = start+less.size();
		return mid;
	}
}