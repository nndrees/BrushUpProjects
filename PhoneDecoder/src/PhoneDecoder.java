import java.util.*;

class PhoneDecoder {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);  
	    System.out.println("Enter Phone Number with text:");

	    String phonestart = input.nextLine();  
	    String phoneEnd = decode(phonestart);
	    System.out.println("Your number is: " + phoneEnd);  
	    input.close();
	}
	
	public static String decode(String starting)
	{
		int numLeng = starting.length();
		starting = starting.toUpperCase();
		ArrayList<Character> newPhone = new ArrayList<Character>();
		
		for (int i = 0; i < numLeng; i++)
		{
			char x = starting.charAt(i);
			
			if (x == 'A' || x == 'B' || x == 'C'  )
			{
				newPhone.add('2');
			}
			else if (x == 'D' || x == 'E' || x == 'F')
			{
				newPhone.add('3');
			}
			else if (x == 'G' || x == 'H' || x == 'I')
			{
				newPhone.add('4');
			}
			else if (x == 'J' || x == 'K' || x == 'L')
			{
				newPhone.add('5');
			}
			else if (x == 'M' || x == 'N' || x == 'O')
			{
				newPhone.add('6');
			}
			else if (x == 'P' || x == 'Q' || x == 'R' || x =='S')
			{
				newPhone.add('7');
			}
			else if (x == 'T' || x == 'U' || x == 'V')
			{
				newPhone.add('8');
			}
			else if (x == 'W' || x == 'X' || x == 'Y' || x == 'Z')
			{
				newPhone.add('9');
			}
			else if (x == '(')
			{
				newPhone.add('(');
			}
			else if (x == ')')
			{
				newPhone.add(')');
			}
			else if (x == '-')
			{
				newPhone.add('-');
			}
			else if (x == '1')
			{
				newPhone.add('1');
			}
			else if (x == '2')
			{
				newPhone.add('2');
			}
			else if (x == '3')
			{
				newPhone.add('3');
			}
			else if (x == '4')
			{
				newPhone.add('4');
			}
			else if (x == '5')
			{
				newPhone.add('5');
			}
			else if (x == '6')
			{
				newPhone.add('6');
			}
			else if (x == '7')
			{
				newPhone.add('7');
			}
			else if (x == '8')
			{
				newPhone.add('8');
			}
			else if (x == '9')
			{
				newPhone.add('9');
			}
			else if (x == '0')
			{
				newPhone.add('0');
			}
			else
			{
				continue;
			}
		}
		String newPhoneClean = newPhone.toString();
		newPhoneClean = newPhoneClean.replace("[", "");
		newPhoneClean = newPhoneClean.replace("]", "");
		newPhoneClean = newPhoneClean.replace(",", "");
		newPhoneClean = newPhoneClean.replace(" ", "");
		return newPhoneClean;
	}
}