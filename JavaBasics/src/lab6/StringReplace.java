package lab6;

import java.util.Scanner;

public class StringReplace {


	 public String alterString(String str)
    {
           StringBuffer a = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = a.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                  {
               	   a.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return a.toString();
    }
   
	 public static void main(String[] ar)
	 {
		 Scanner sc = new Scanner(System.in);
		 StringReplace a = new StringReplace();
		 
		 System.out.println("Enter a string");
		 String str = sc.next();
		 
		 System.out.println(a.alterString(str));
		 
	 }

}
