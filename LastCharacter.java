/* Q13. Write a Java program to find the last character of a string.
Description:Accept string and print last character.
Input:Enter string: Laptop
Output:Last character is: p.*/
package StringAssign;
import java.util.*;
public class LastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		if(str.length()>0)
		{
			 char ch = str.charAt(str.length() - 1);  
	         System.out.println("Last character is:"+ch);
	    } 
		else 
		{
	         System.out.println("String is empty");
		}
	}

}
