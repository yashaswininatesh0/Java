import java.util.*;
 
class StringBuffer
{
 public static void main(String args[])
 {
     int c;
 String str;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string to be toggled");
 str=sc.nextLine();
 char a[]=str.toCharArray();
     for(int i=0;i<a.length;i++)
     {
         if(a[i]>='A' && a[i]<='Z')
         {
             a[i]=(char)((int)a[i]+32);
         }
         else if(a[i]>='a' && a[i]<='z')
         {
             a[i]=(char)((int)a[i]-32);
         }
     }
       System.out.println("The toggled string is :-");
 for(c=0;c<a.length;c++)
     System.out.print(a[c]);
 }
}


	
		
	