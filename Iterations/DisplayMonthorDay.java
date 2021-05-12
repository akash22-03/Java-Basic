    import java.util.Scanner;
     
     public class DisplayMonthorDay {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		int in = 1;
     		while(in!=3)
     		{
    		System.out.println("1.Display the Months");
    		System.out.println("2.Display the Days");
    		System.out.println("3.Exit");
    		in = sc.nextInt();
   		switch(in)
    		{
    		    case 1:
   		        System.out.println("1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
    		        break;
   		    case 2:
    		        System.out.println("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
   		        break;
    		    case 3: 
    		        System.exit(0);
    		}
    		}
    	}
    
    }
    