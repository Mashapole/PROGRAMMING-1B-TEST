package Q2;

import java.util.Scanner;


public class Runner 
{
    public static void main(String[] args)
    {
     String location, hospital;
     int inspectionYears;
     
     Scanner sc= new Scanner(System.in);
     
     System.out.print("Enter the hospital location: ");
     location=sc.nextLine();
     System.out.print("Enter the hospital name: ");
     hospital=sc.nextLine();
     System.out.print("Enter years since last inspection: ");
     inspectionYears=sc.nextInt();
     
     HospitalInspection object= new HospitalInspection(location,hospital,inspectionYears);
     object.PrintInspectionRecord();
    }
}
