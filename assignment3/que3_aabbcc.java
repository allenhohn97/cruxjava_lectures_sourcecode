package assignment3;

import java.util.Scanner;

public class que3_aabbcc {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scn= new Scanner(System.in);
		String s=scn.nextLine();
		int i=0;
		for( i=0;i<s.length();i++)
		{if(s.charAt(i)!=s.charAt(i+1))
		{System.out.print(s.charAt(i));
		
		}
		if(i+1==s.length()-1)
		{System.out.print(s.charAt(i+1));
		break ;
		}
		}
		
	
	}

}
