/* Q11. Write a Java program to count special characters.
Description:Count characters which are not alphabets and digits.
Input:Enter string: java@123#
Output:Special characters are: 2.*/
package StringAssign;
import java.util.*;
public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) 
			{
				count++;
	        }
		}
		System.out.println("Special Character are:"+count);
	}

}
