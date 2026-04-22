/* Q5. Write a Java program to count total spaces in a string.
Description:Accept a sentence and count number of blank spaces.
Input:Enter string: Java is easy
Output:Total spaces are: 2.*/
package StringAssign;
import java.util.*;
public class SpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int spaceCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				spaceCount++;
			}
		}
		System.out.println("Space Count are:"+spaceCount);
	}

}
