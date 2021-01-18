package Assignment;

import java.util.Scanner;

	
class StringReverseWithDifferentMethod		
{
		/**
		 * This method uses inbuilt algorithm for reversing the string
		 * @param input
		 */
		public void stringReaverseUsingInbuiltMethod() {
		
			String str="Welcome to Test Yantra";
			StringBuffer buff=new StringBuffer(str);
			System.out.println(".......1st method........");
			System.out.println(buff.reverse());
			
		}
		
		

		/**
		 * This method uses without inbuilt algorithm for reversing the string
		 * @param 
		 * @return
		 */
		String stringReverseWithoutInbuiltMethod() {
			String str="Welcome to Test Yantra";
			char[] c=str.toCharArray();
		
			String reverse="";
			for(int i=c.length-1;i>=0;i--)
			{
				reverse+=str.charAt(i);
			}
			System.out.println("......2nd approach...........");
			System.out.println(reverse);
			return reverse;
		}
		
		
		
	/**
	 * This method uses custom algorithm for reversing the string
	 * @param 
	 * @return
	 */
		public String stringReaverseCustomMethod()	{
			Scanner scan=new Scanner(System.in);
			System.out.println(".......3rd aprroach..............");
			System.out.println("Enter string: ");
			String s=scan.nextLine();
			String reverse="";
			
			// create string variable and assign user input  from console into that variable
			System.out.println("reverse of word in a  string: ");
			
			for(int i=s.length()-1;i>=0;i--)
			{
				reverse+=s.charAt(i);
			}
			
			System.out.println(reverse);
		
		return reverse; 
		}
		
	}		
public class StringRerverse
{
	public static void main(String[] args)
	{
		StringReverseWithDifferentMethod output=new StringReverseWithDifferentMethod();
		
		output.stringReaverseUsingInbuiltMethod();
		output.stringReverseWithoutInbuiltMethod();
		output.stringReaverseCustomMethod();
	}
	
}
