package assignment3;

import java.util.Scanner;

public class que7_select {

	public static void main(String[] args) {
	System.out.println("enter the no. of elements");
	Scanner s = new Scanner(System.in);
	int N =s.nextInt();
	int[] arr= new int[N];
	for(int i=0;i<N;i++)
	{ arr[i]=s.nextInt();
	}
	int[] arr1=selsort(arr);
	for(int i=0;i<N;i++)
	{ System.out.println(arr1[i]);
	}
	int[] arr2=inssort(arr);
	for(int i=0;i<N;i++)
	{System.out.println(arr2[i]);
	}
	int[] arr3= bubsort(arr);
	for(int i=0;i<N;i++)
	{System.out.println(arr3[i]);
	}
	}
public static int[] selsort(int[] arr)
{ for(int i=0;i<arr.length;i++)
{ for(int j=i+1;j<arr.length;j++)
{if(arr[j]<arr[i])
{ int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

return arr;
}
public static int[] inssort(int[] arr)
{for(int i=0;i<arr.length;i++)
{ for(int j=i;j>0;j--)
{if(arr[j]<arr[j-1])
{ int temp= arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
}
else
 break;}
}return arr;

}

public static  int[] bubsort(int[] arr)
{for(int i=0;i<arr.length-1;i++)
{int N = arr.length-1;
for(int j=1;j<N;j++)
{if(arr[j]<arr[j-1])
{int temp = arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
}
}
N--;
}
return arr;
}
}
