import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
	    System.out.print("Enter a char : ");
       char ch = num.next().charAt(0);
       int val=ch;
       val=val+3;
       char op = (char)val;
       System.out.print("value is "+op);
	}
}
