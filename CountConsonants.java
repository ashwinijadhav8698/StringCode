/* Q3. Write a Java program to count total consonants in a string.
Description:Accept a string and count all consonants excluding vowels and spaces.
Input:Enter string: programming
Output:Total consonants are: 8.*/
package StringAssign;
import java.util.*;
public class CountConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int consonantCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='A'&& ch<='Z') || (ch >='a' && ch <='z'))
			{
				if(ch!='A'&& ch!='E'&& ch!='I'&& ch!='O' && ch!='U'&& ch!='a' && ch!='e' && ch!='i'&& ch!='o' && ch!='u')
				{
					consonantCount++;
				}
			}
		}
		System.out.println("Consonants are:"+consonantCount);
	}

}
