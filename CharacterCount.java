/* Q1. Write a Java program to count total characters in a given string.
Description: Accept a string from the user and calculate the total number of characters present 
in it (including spaces).
Input:Enter string: Hello World
Output: Total characters are: 11.*/
package StringAssign;
import java.util.*;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			str.charAt(i);
			count++;
		}
		 System.out.println("Total characters are: " + count);
	}

}
