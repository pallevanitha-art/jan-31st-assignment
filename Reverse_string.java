import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  System.out.print("Original word : ");
	   Scanner sc = new Scanner(System.in);
	   String str= sc.nextLine();
	   char ch;
	   String nstr="";
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
	}
}
