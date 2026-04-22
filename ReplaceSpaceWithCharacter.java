/* Q16. Write a Java program to replace space with underscore.
Description:Replace every space with '_' character.
Input:Enter string: Java Program
Output:Java_Program.*/
package StringAssign;
import java.util.*;
public class ReplaceSpaceWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				ch='_';
			}
			result=result+ch;
		}
		System.out.println("Replace Character are:"+result);
	}

}
