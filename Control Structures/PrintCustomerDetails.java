import java.util.*;
public class PrintCustomerDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter your name:");
 		String name=sc.nextLine();
 	    System.out.println("Enter age:");
	    int age=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter gender:");
	    String gender=sc.nextLine();
	    System.out.println("Hailing from:");
	    String loc=sc.nextLine();
	    
	    System.out.println("Welcome,"+name);
	    System.out.println("Age:"+age);
	    System.out.println("Gender:"+gender);
	    System.out.println("City:"+loc); 

	}

}
