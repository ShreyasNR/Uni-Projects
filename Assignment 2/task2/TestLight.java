

public class TestLight {
    public static void main(String[] args) {
        //first object for light
        Light lightObj1=new Light();
        lightObj1.setBrightness(lightObj1.HIGH);
        lightObj1.setColor("yellow");
        lightObj1.setOn(true);
        System.out.println(lightObj1.toString());
        //second object for light
        Light lightObj2=new Light();
        lightObj2.setBrightness(lightObj1.MEDIUM);
        lightObj2.setColor("blue");
        lightObj2.setOn(false);
        System.out.println(lightObj2.toString());
        
    }
}
