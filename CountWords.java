/* Q18. Write a Java program to count words in a string.
Description:Count the number of words separated by spaces.
Input:Enter string: Java is powerful
Output:Total words: 3.*/
package StringAssign;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int count=0;
		if(str.length()>0)
		{
			count=1;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch==' ')
				{
					count++;
				}
			}
		}
		System.out.println("Word count are:"+count);
	}

}
