 import java.util.*;

 public class quickSort1{
    static void partition(int[] ar) {
		List<Integer> greater= new ArrayList<Integer>();
		List<Integer> less = new ArrayList<Integer>();
		int p = ar[0];
		for(int i=1; i<ar.length; i++){
			if(ar[i]>p){
				greater.add(ar[i]);
			}
			else{
				less.add(ar[i]);
			}
		}
		less.add(p);
		less.addAll(greater);
		int[] output = new int[ar.length];
		for(int i=0; i<ar.length; i++){
			output[i] = less.get(i).intValue();
		}
		printArray(output);     
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
           partition(ar);
       }  
 }