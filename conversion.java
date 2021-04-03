package conversion;
import java.util.Scanner;
public class conversion {
	public static void main(String[] args) {
		int y;
		System.out.println("enter number of minutes");
		Scanner sc =new Scanner(System.in);
		y=sc.nextInt();
		int a=Years(y);
		int c=y%525600;
		int b=c/1440;
		System.out.println(y+" minutes is approximately "+a+" years and "+b+" days");
	}
	public static int Years(int a)
	{
	int b=a/525600;
	return b;
	}
	

}
