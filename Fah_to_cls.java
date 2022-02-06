import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
	    System.out.print("Enter a Fahrenheit : ");
	    float fh = num.nextFloat();
        float cs = (fh - 32) * 5 / 9;
       System.out.print("converting fahrenheit to celsius is "+cs);
	}
}
