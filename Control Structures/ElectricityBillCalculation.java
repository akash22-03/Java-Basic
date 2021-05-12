import java.util.*;
public class ElectricityBillCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units consumed");
       double units = sc.nextDouble();
       if(units<20) System.out.println("No Charge");
       else if(units>20&&units<100) System.out.println("You have to pay Rs."+(units*3.5));
       else if(units>=100)System.out.println("You have to pay Rs."+(units*5.0));

	}

}
