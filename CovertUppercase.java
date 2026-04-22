/* Q6. Write a Java program to convert string into uppercase without using inbuilt function.
Description:Accept a string and convert lowercase letters into uppercase using ASCII logic.
Input:Enter string: java
Output:Uppercase string: JAVA.*/
package StringAssign;
import java.util.*;
public class CovertUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			result=result+ch;
		}
		System.out.println("Uppercase String is :"+result);
	}

}
