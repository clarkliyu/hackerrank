import java.util.*;

public class quickSort{
    static void quickSort(int[] ar, int start, int end) {
    	if(end-start<=1)
    		return;
    	int mid = partition(ar, start, end);
    	quickSort(ar, start, mid);
    	quickSort(ar, mid+1, end);

    }   
 	
    static int partition(int[] ar, int start, int end) {
		List<Integer> greater= new ArrayList<Integer>();
		List<Integer> less = new ArrayList<Integer>();
		int p = ar[start];
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
 	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
           System.out.println("");
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }
        quickSort(ar, 0, n);
        printArray(ar);
    }   
}