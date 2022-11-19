
package Q1;

import java.text.DecimalFormat;


public class Runner {
    public static void main(String[] args)
    {
        int[][] perfomedNumber={{4, 8, 6},{5, 4, 2},{4, 2, 8}};
        String[] facName={"HOSPITAL 1","HOSPITAL 2","HOSPITAL 3"};
        
        String head="\t\tJAN\t\tFEB\t\tMAR\t\tAVG";
        
        DecimalFormat format= new DecimalFormat("0.00");
        
        System.out.println("********************************************************************************");
        System.out.println("HEALTH INSPECTION REPORT");
        System.out.println("********************************************************************************");
        System.out.println(head);
        System.out.println(facName[0]+": -->\t "+perfomedNumber[0][0]+"\t\t"+perfomedNumber[0][1]+"\t\t"+perfomedNumber[0][2]+"\t\t"+(int) Methods.FirstCalculation(perfomedNumber[0][0],perfomedNumber[0][1],perfomedNumber[0][2])/3 );
        System.out.println(facName[1]+": -->\t "+perfomedNumber[1][0]+"\t\t"+perfomedNumber[1][1]+"\t\t"+perfomedNumber[1][2]+"\t\t"+format.format(Methods.SecondCalculation(perfomedNumber[1][0],perfomedNumber[1][1],perfomedNumber[1][2])/3));
        System.out.println(facName[2]+": -->\t "+perfomedNumber[2][0]+"\t\t"+perfomedNumber[2][1]+"\t\t"+perfomedNumber[2][2]+"\t\t"+format.format(Methods.ThirdCalculation(perfomedNumber[2][0],perfomedNumber[2][1],perfomedNumber[2][2])/3));
        System.out.println("********************************************************************************");
        System.out.println("MONTHLY TOTALS");
        System.out.println("********************************************************************************");
        System.out.println(facName[0]+":\t"+Methods.FirstCalculation(perfomedNumber[0][0],perfomedNumber[0][1],perfomedNumber[0][2]));
        System.out.println(facName[1]+":\t"+Methods.SecondCalculation(perfomedNumber[1][0],perfomedNumber[1][1],perfomedNumber[1][2]));
        System.out.println(facName[2]+":\t"+Methods.ThirdCalculation(perfomedNumber[2][0],perfomedNumber[2][1],perfomedNumber[2][2]));
        System.out.println("********************************************************************************");
    }
}
