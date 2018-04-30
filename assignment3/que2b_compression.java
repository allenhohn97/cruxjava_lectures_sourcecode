package assignment3;

import java.util.Scanner;

public class que2b_compression {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s= scn.nextLine();
		int a=1;
		for(int i=0;i<s.length();i++)
		{ if(s.charAt(i)==s.charAt(i+1))
		{ a++;
		}
		else{ 
			System.out.print(s.charAt(i));
			if(a>1)
			{System.out.print(a);
			a=1;
			}
		}
if(i+1==s.length()-1)
{System.out.print(s.charAt(i+1));
  if(a>1)
  {System.out.print(a);}
break;
}
	}

}
}
