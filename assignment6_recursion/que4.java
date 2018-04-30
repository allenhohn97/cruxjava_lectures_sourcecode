package assignment6_recursion;

import java.util.ArrayList;

public class que4 {

	public static void main(String[] args) {
		System.out.println(code("1123"));

	}

	public static ArrayList<String> code(String str)
	{ 
	if(str.length()==0)
	{  ArrayList<String> al=new ArrayList<>();
 al.add("");
return al;	}
		
		if(str.length()==1)
	{
		ArrayList<String> al=new ArrayList<>();
 al.add(kcode(str));	
return al;
	}
	int n=0;
	if(str.charAt(0)-'0'<3&&str.charAt(1)-'0'<7)
	{ n=2;
	
	}
	else
	{ n=1;
	}
	
	String[] currentchar=new String[n];
	
	if(n==2)
	{currentchar[0]=kcode(str.substring(0,1));
	currentchar[1]=kcode(str.substring(0,2));}
	else
		{currentchar[0]=kcode(str.substring(0,1));}


	ArrayList<String> current=new ArrayList<>();
	ArrayList<String> smaller=code(str.substring(1));
	
	
	{ for(int j=0;j<smaller.size();j++)
	{
	current.add(currentchar[0]+smaller.get(j));
	if(n==2)
		current.add(currentchar[1]+code(str.substring(2)));
	}
	return current;
	}
	}

	public static String kcode(String s) {
		String s1 = new String("");
		switch (s) {
		case "1":
			s1 = "a";
			break;
		case "2":
			s1 = "b";
			break;
		case "3":
			s1 = "c";
			break;

		case "4":
			s1 = "d";
			break;
		case "5":
			s1 = "e";
			break;
		case "6":
			s1 = "f";
			break;
		case "7":
			s1 = "g";
			break;
		case "8":
			s1 = "h";
			break;
		case "9":
			s1 = "i";
			break;
		case "10":
			s1 = "j";
			break;
		case "11":
			s1 = "k";
			break;
		case "12":
			s1 = "l";
			break;
		case "13":
			s1 = "m";
			break;
		case "14":
			s1 = "n";
			break;
		case "15":
			s1 = "o";
			break;
		case "16":
			s1 = "p";
			break;
		case "17":
			s1 = "q";
			break;
		case "18":
			s1 = "r";
			break;
		case "19":
			s1 = "s";
			break;
		case "20":
			s1 = "t";
			break;
		case "21":
			s1 = "u";
			break;
		case "22":
			s1 = "v";
			break;
		case "23":
			s1 = "w";
			break;
		case "24":
			s1 = "x";
			break;
		case "25":
			s1 = "y";
			break;
		case "26":
			s1 = "z";
			break;
		}
		return s1;

	}

}
