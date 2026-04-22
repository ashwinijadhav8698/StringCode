/* Q8. Write a Java program to reverse a string.
Description:Accept a string and print it in reverse order.
Input:Enter string: coding
Output:Reversed string: gnidoc.*/
package StringAssign;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			result=result+ch;
		}
		System.out.println("Reverse String is:"+result);
	}

}
