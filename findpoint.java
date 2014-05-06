import java.util.ArrayList;

public class findpoint{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		test.add(temp);
		
		System.out.println("Arraylist contains: " + temp.toString());
		System.out.println("Arraylist contains: " + test.toString());
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		temp2.add(0);
		temp2.add(0);
		temp2.add(1);
		temp2.add(1);
		test.add(temp2);
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res = symmetric(test);
		System.out.println("Arraylist contains: " + res.toString()); 
		System.out.println("Arraylist contains: " + test.toString());
	}
	
	public static ArrayList<ArrayList<Integer>> symmetric (ArrayList<ArrayList<Integer>> points){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(points.isEmpty())
			return res;
		int x=0;
		int y=0;
		int i=0;
		int num = points.get(0).get(0);
		for (i=1; i<=num; i++){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			x = 2*points.get(i).get(2) - points.get(i).get(0);
			y = 2*points.get(i).get(3) - points.get(i).get(1);
			temp.add(x);
			temp.add(y);
			res.add(temp);
		}
		return res;
	}
}
