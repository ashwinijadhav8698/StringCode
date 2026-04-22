/* Q20. Write a Java program to compare two strings without using equals().
Description:Compare character by character.
Input:
 Enter string1: java
 Enter string2: java
Output:Strings are equal.*/
package StringAssign;
import java.util.*;
public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1=abc.nextLine();
		System.out.println("Enter String 2:");
		String str2=abc.nextLine();
		 boolean isEqual = true;
		if(str1.length()!=str2.length())
		{
			isEqual=false;
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i) != str2.charAt(i))
				{
					isEqual = false;
                    break;
				}
			}
		}
		if(isEqual) 
		{
            System.out.println("Strings are equal");
        } 
		else 
		{
            System.out.println("Strings are not equal");
        }
	}

}
