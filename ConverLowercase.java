/* Q7. Write a Java program to convert string into lowercase without using inbuilt function.
Description:Accept a string and convert uppercase letters into lowercase using logic.
Input:Enter string: HELLO
Output:Lowercase string: hello.*/
package StringAssign;
import java.util.*;
public class ConverLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			result=result+ch;
		}
		System.out.println("Lowercase String are:"+result);
	}

}
