/* Q10. Write a Java program to print each character on new line.
Description:Accept a string and display each character separately.
Input:Enter string: Java
Output:
 J
 a
 v
 a.*/
package StringAssign;
import java.util.*;
public class NewLineCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}

}

