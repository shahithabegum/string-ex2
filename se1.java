import java.util.*;
import java.lang.*;
class se1
{
  public static void main(String arg[])
   {
     try
         {
            String s;
             Scanner t=new Scanner(System.in);
             System.out.println("write some thing");
	s=t.nextLine();
	System.out.println(s.indexOf("h"));
	 }
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}