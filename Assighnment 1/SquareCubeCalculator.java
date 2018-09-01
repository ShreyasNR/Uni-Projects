
import java.util.Scanner;


public class SquareCubeCalculator {

    public static void main(String[] args) {
        
        //welcoming message
        System.out.println("Welcome to Calculator Program!");
        System.out.println("");
        Scanner enterNum=new Scanner(System.in);
        
        //input 1st no.
        System.out.print("Please enter first number: ");
        int firstNum=enterNum.nextInt();
        
        //input 2nd no.
        System.out.print("Please enter second number: ");
        int secondNum=enterNum.nextInt();
        System.out.println("");
        
        //printing data
        System.out.println("Number\t\tSquare\t\tCube");
        //loop to calculate squares and cubes
        for(int loopVar=firstNum;loopVar<=secondNum;loopVar++){
            System.out.println(loopVar+"\t\t"+loopVar*loopVar+"\t\t"+loopVar*loopVar*loopVar);
        }
        System.out.println("");
        System.out.println("Goodbye,thank you for using our program!\n");
    }
    
}
