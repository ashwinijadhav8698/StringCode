/*Q4. Write a Java program to count total digits in a string.
Description:Accept a string containing characters and numbers and count how many digits are present.
Input:Enter string: abc123xyz45
Output:Total digits are: 5.*/
package StringAssign;
import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int digitCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				digitCount++;
			}
		}
		System.out.println("Digits are:"+digitCount);
	}

}
