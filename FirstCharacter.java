/* Q12. Write a Java program to find the first character of a string.
Description:Accept string and print first character.
Input:Enter string: Laptop
Output:First character is: L.*/
package StringAssign;
import java.util.*;
public class FirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=abc.nextLine();
		if(str.length()>0)
		{
			char ch=str.charAt(0);
			System.out.println("First character is:"+ch);
        } 
		else 
		{
            System.out.println("String is empty");
        }
	}

}
