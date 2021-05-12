import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reverse = 0;
		for(int i=num ; num!=0 ; num/=10)
		{
		    int temp = num%10;
		    reverse = reverse*10 +temp;
		}
		System.out.println(reverse);
	}

}
    