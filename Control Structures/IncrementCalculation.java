import java.util.*;
public class IncrementCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
       double performance = sc.nextDouble();
        
         if(salary<=0 || performance<1 || performance>5)
            {
                 System.out.println("Invalid Input");
            }
        else
         {
             if(performance>=1&&performance<=3)
             {
                 System.out.println((int)(salary+(salary*0.1)));
            }
             else if(performance>=3.1 && performance<=4)
            {
                System.out.println((int)(salary+(salary*0.25)));
            }
             else if(performance>=4.1 && performance<=5)
            {
                System.out.println((int)(salary+(salary*0.3)));
            }
        }
        

	}

}
