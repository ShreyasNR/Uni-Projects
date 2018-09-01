


public class CasualStaff extends Staff {

   private int hours;

    public CasualStaff( String name, String id, String position,int hours) {
        super(name, id, position);
        this.hours = hours;
    }

    public CasualStaff() {

    }@Override
    public String toString() {
        return getName()+"\t\t"+ getId()+"\t\t"+ getPosition()+"\t\t"+ String.valueOf(getHours());

    }
      
   public void setHours(int hours) {
        this.hours = hours;
    }
   
    public int getHours() {
        return hours;
    }

 
   

  

}
