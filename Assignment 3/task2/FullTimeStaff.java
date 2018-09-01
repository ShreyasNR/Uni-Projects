

public class FullTimeStaff extends Staff {

    private String researchArea;

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public FullTimeStaff( String name, String id, String position,String researchArea) {
        super(name, id, position);
        this.researchArea = researchArea;
    }

    public FullTimeStaff() {

    }

    public String getResearchArea() {
        return researchArea;
    }

    @Override
    public String toString() {
       return getName()+"\t\t"+ getId()+"\t\t"+ getPosition()+"\t\t"+ getResearchArea();
  
    }

}
