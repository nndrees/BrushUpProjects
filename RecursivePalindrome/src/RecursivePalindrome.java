import java.util.*;

class RecursivePalindrome 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);  
	    System.out.println("Enter word to check if palindrone:");

	    String pal = input.nextLine();  
	    boolean prod = isPal(pal);
	    System.out.println("Is " + pal + " a palindrone: " + prod);  
	    input.close();
	}
	
	public static boolean isPal(String pali)
	{
		pali = pali.toLowerCase();
		boolean result = true;
		int len = pali.length();
		if (len == 0 || len == 1) 
		{
			return result;
		}
		else
		{
			//System.out.println(len);
			char fir = pali.charAt(0);
			char las = pali.charAt(len-1);
			if (fir == las)
			{
				char[] sub = pali.toCharArray();
				sub = Arrays.copyOfRange(sub, 1, len-1);
				String temp = Arrays.toString(sub);
				temp = temp.replace("[", "");
				temp = temp.replace("]", "");
				temp = temp.replace(",", "");
				temp = temp.replace(" ", "");
				//System.out.println(temp);
				return isPal(temp);
			}
			else 
			{
				return false;
			}			
		}
				
	}
}