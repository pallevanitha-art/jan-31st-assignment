import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner num = new Scanner(System.in);
         System.out.print("Enter integer Number: ");
         int n1 = num.nextInt();
         System.out.print("Enter decimal Number: ");
         float n2 = num.nextFloat();
         float result;
         result = n1 * n2;
		System.out.println("Output is "+result);
	}
}
