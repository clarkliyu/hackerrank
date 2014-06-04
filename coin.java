import java.util.*;

public class coin{                         
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		String s = myScan.nextLine();
		String p = s.replaceAll("\\W","");
		System.out.println(p);
	}

}