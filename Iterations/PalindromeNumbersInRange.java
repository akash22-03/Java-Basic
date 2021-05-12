import java.util.Scanner;

public class PalindromeNumbersInRange {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int srange = sc.nextInt();
		System.out.println("Enter the ending range");
		int erange = sc.nextInt();
		
		for(int i = srange; i<=erange;i++)
	 if(ispalindrome(i)==1)
            System.out.print(i + " ");
	}
	static int ispalindrome(int n)
	{
	    int rev = 0;
	    for(int i=n;i>0;i/=10)
	        rev = rev*10 + i%10;
	        
	    return (n==rev) ? 1 : 0;
	}
	
	

}
   