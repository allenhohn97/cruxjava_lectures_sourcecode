package assignment3;

import java.util.Scanner;

public class que5_sortstring {

	public static void main(String[] args) {
	System.out.println("enter the no. of strings");
	Scanner s= new Scanner(System.in);
	int N = s.nextInt();
	String[] str=new String[20];
	for(int i=0;i<N;i++)
	{System.out.println("enter the string no ."+i+1);
	str[i]=s.next();
	for(int j=i;j>0;j--)
	{if(str[j].length()<str[j-1].length())
	{String temp=str[j];
	str[j]=str[j-1];
	str[j-1]=temp;
	}
	else 
	{break ;
	}
	
	
	}
	}
	for(int i=0;i<N;i++)
	{System.out.println(str[i]);
	}
}

}
