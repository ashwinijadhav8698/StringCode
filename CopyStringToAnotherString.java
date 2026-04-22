/* Q19. Write a Java program to copy one string into another.
Description:Copy characters manually into another string.
Input:Enter string: Hello
Output:Copied string: Hello.*/
package StringAssign;
import java.util.*;
public class CopyStringToAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1=abc.nextLine();
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			str2=str2+ch;
		}
		System.out.println("String 2:"+str2);
	}

}
