/* Q15. Write a Java program to count lowercase letters.
Description:Count lowercase letters present in string.
Input:Enter string: JaVaPro
Output:Lowercase letters: 4.*/
package StringAssign;
import java.util.*;
public class CountLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count++;
			}
		}
		System.out.println("LowerCase count are:"+count);
	}

}
