// SHREY ASTHANA 19MIM10066
import java.util.Scanner;

public class BarChartPrintingProgram
{
   public static void main (String[] args)
   {
       int n = 0;
       Scanner input = new Scanner (System.in);
       System.out.print("Enter five numbers between 1 and 30: ");
      
       for (int i = 0; i < 5; ++i)
       {
           n = input.nextInt();
          
           for (int j = 0; j < n; ++j)
               System.out.print('*');
           System.out.println();
       }
       System.out.println();
   }
}