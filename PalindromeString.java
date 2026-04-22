/* Q9. Write a Java program to check whether a string is palindrome.
Description:
 Check whether the given string reads the same forward and backward.
Input:Enter string: madam
Output:String is Palindrome.*/
package StringAssign;
import java.util.*;
public class PalindromeString {

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
		 if(str.equals(result)) 
		 {
	          System.out.println("String is Palindrome");
	     } 
		 else 
		 {
	          System.out.println("String is not Palindrome");
	     }
	}

}
