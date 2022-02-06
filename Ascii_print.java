import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      
	  Scanner num = new Scanner(System.in);
	  System.out.print("Enter a char : ");
       char ch = num.next().charAt(0);
       int val=ch;
       System.out.print("value is "+val);
	  }
	  
}
