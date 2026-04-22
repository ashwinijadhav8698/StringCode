/* Q2. Write a Java program to count total vowels in a string.
Description:Accept a string and count how many vowels (a,e,i,o,u) are present.
Input:Enter string: education
Output:Total vowels are: 5.*/
package StringAssign;
import java.util.*;
public class countTotalVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		int vowelCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch=='U'|| ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("Vowels are:"+vowelCount);
	}

}
