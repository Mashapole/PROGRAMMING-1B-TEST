package Q2;


public abstract class Inspection implements iInspection
{
    protected String location;
    protected String hospital;
    protected int inspectionYears;

    public Inspection() 
    {
    }

    public Inspection(String location, String hospital, int inspectionYears) {
        this.location = location;
        this.hospital = hospital;
        this.inspectionYears = inspectionYears;
    }

    public String getLocation_() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getInspectionYears() {
        return inspectionYears;
    }

    public void setInspectionYears(int inspectionYears) {
        this.inspectionYears = inspectionYears;
    }
    
    

}
