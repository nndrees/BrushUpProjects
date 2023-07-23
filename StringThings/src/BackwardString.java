import java.util.*;

public class BackwardString 
{
	public static String back;
	public static String start;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		start = sc.nextLine();
		back = the(start);
		System.out.println("Your Word backwords: " + back);
	}
	
	public static String the(String s) 
	{

		ArrayList<Character> next = new ArrayList<Character>();
		String done;
		
		for(int i = s.length()-1; i >= 0 ; i--) 
		{
			next.add(s.charAt(i));
		}
		
		done = next.toString();
		done = done.replace(",", "");
		done = done.replace("[","");
		done = done.replace("]","");
		done = done.replace(" ","");
		return done;
	}
}
