import java.util.*;                                                                 

public class countingSort{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int size = Integer.valueOf(myScan.nextLine());
		int[] number = new int[size];
		String[] word = new String[size];
 		for (int i=0; i<size; i++){
 			word[i] = myScan.nextLine();
 			String[] temp = word[i].split(" "); 
 			number[i] = Integer.valueOf(temp[0]);
		} 
		Arrays.sort(number);
		int[] output   = new int[100];
		int j=0;
		int count =0; 
		for (int i=0; i<100; i++){
			while(j<size){
				if(number[j] == i){
					count++;
					j++;
				}
				else
					break;
			}
			output[i] = count;
		}
		System.out.println(Arrays.toString(output).replace("[","").replace("]","").replace(",",""));
	}
}