/* Q14. Write a Java program to count uppercase letters.
Description:Count how many uppercase letters exist in string.
Input:Enter string: JaVaPro
Output:Uppercase letters: 3.*/
package StringAssign;
import java.util.*;
public class CountUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		System.out.println("UpperCase Count are:"+count);
	}

}
