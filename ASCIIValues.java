/* Q17. Write a Java program to print ASCII values of characters.
Description:Print ASCII value of every character.
Input:Enter string: AB
Output:
 A = 65
 B = 66.*/
package StringAssign;
import java.util.*;
public class ASCIIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int ascii = (int) ch;
			System.out.println(ch+"="+ascii);
		}
	}

}
