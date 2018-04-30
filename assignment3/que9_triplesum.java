package assignment3;import java.util.Scanner;

import lecture3.*;

public class que9_triplesum {

	public static void main(String[] args) {
		int[] arr=largestintegerinarray.takeinput();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no. whose sum u wanna find");
		int x=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{for(int j=i+1;j<arr.length;j++)
		{ for(int c=j+1;c<arr.length;c++)
		{ if(arr[i]+arr[j]+arr[c]==x)
			{System.out.println(arr[i] +","+arr[j]+","+arr[c]);}
		}

	}

}
		
	}
}
