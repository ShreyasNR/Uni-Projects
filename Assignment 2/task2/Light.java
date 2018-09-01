
public class Light {

    //contants to denote the light brightness
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int brightness;
    private boolean on;
    String color;
    //constructor creating the default lights
    public Light(){
        brightness = LOW;
        on = false;
        color = "red";
    }
    //accessors
    public int getBrightness() {
        return brightness;
    }
    public boolean getOn() {
        return on;
    }
    public String getColor() {
        return color;
    }
    
    //mutators
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    
    public void setOn(boolean  on) {
        this.on = on;
    }
    
     public void   setColor(String color) {
        this.color = color;
    }
     //method to return the description of light
     public String toString(){
         
         if(on){
             return  "Light  Color: "+color+"\tLight Brightness : "+brightness;
         }
         else{
             return  "Light  Color: "+color+"\tLight is Off";
          
         }
         
     }
     
}
