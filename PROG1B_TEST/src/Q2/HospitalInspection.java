package Q2;


public class HospitalInspection extends Inspection{

    public HospitalInspection(String location, String hospital, int inspectionYears) 
    {
        super(location, hospital, inspectionYears);
    }

    @Override
    public String getLocation() 
    {
      return this.location;
    }

    @Override
    public String getHospitalName() 
    {
       return this.hospital;
    }

    @Override
    public int getYearsSinceInspection()
    {
       return this.inspectionYears;
    }

    @Override
    public String getInspectionNeeded() 
    {
     if(getYearsSinceInspection()>2)
     {
         return "Yes";
     }
     else
     {
         return "No";
     }
     
    }
    
    public void PrintInspectionRecord()
    {
     System.out.println("\n\nHOSPITAL INSPECTION REPORT");
     System.out.println("***************************************************************");
     System.out.println("HOSPITAL LOCATION: \t"+getLocation());
     System.out.println("HOSPITAL NAME: \t"+getHospitalName());
     System.out.println("YEARS SINCE INSPECTION: \t"+getYearsSinceInspection());
     System.out.println("INSPECTION NEEDED: \t"+getInspectionNeeded());
     System.out.println("***************************************************************");
     
    }
    
}
