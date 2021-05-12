import java.util.Scanner;
 
public class LuckyNumber {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the car no:");
		int car = sc.nextInt();
	
		if(car>999&&car<10000)
		{
		    int temp=0;
		    for(int i=car;car!=0;car/=10)
		    {
		        temp = temp + car%10;
	    }
		    if(temp%3==0 || temp%5==0 || temp%7==0)
		    {
	        System.out.println("Lucky Number");
		    }
		    else
		    {
		        System.out.println("Sorry its not my lucky number");    
		    }
		}
		else
		{
		    System.out.println(car + " is not a valid car number");    
		}
		
	}

}