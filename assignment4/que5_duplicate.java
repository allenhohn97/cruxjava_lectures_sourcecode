package assignment4;

import assignment3.*;

import java.util.Scanner;

public class que5_duplicate {

	public static void main(String[] args) {
		System.out.println("enter the no. of elements ");
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int[] arr = new int[N];
		System.out.println("enter the elements");
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("the duplicate no. is" + dupli(arr));
	}

public static int dupli(int[] arr)
{ arr=que7_select.inssort(arr);
int k=0;
for(int i=0;i<arr.length;i++)
{if(arr[i]==arr[i+1])
{ 
 k= arr[i];
break;}
return k;


}
}
}
