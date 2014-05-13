import java.util.*;
import java.lang.Math.*;
public class encryption{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		String input = myScan.next();
		int floor = (int) Math.floor(Math.sqrt((double)input.length()));
		int ceil = (int) Math.ceil(Math.sqrt((double)input.length()));
		//System.out.println(floor + " " + ceil);
		int width;
		int height;
		if(floor*floor ==input.length()){
			width = floor;
			height =floor;
		}
		else if(floor*ceil > input.length()){
			width = ceil;
			height = floor;
		}
		else{
			width = ceil;
			height = ceil;
		}

		char[][] matrix = new char[height][width];
		for(int i=0; i<height; i++)
			for(int j=0; j<width; j++){
				if(i*width+j+1>input.length())
					break;
				matrix[i][j] = input.charAt(i*width+j);
				//System.out.println(matrix[i][j]);
			}
		//System.out.println(Arrays.deepToString(matrix));
		char[][] output = new char[width][height];

		for(int i=0; i<width; i++)
			for(int j=0; j<height; j++){
				output[i][j] = matrix[j][i];
			}
		//System.out.println(Arrays.deepToString(output));
        String res = "";
		for(int i=0; i<width; i++){
			res = res + Arrays.toString(output[i]).replaceAll("\\[","").replaceAll("\\]","").replaceAll(", ","") + " ";
		    
		}
        System.out.println(res);

	}
}