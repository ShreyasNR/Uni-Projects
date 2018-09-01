
import java.util.Scanner;


public class bookPurchase {

    public static void main(String[] args) {
        //total sales calculation
        int totalBill=0;
        
        //variable to ask if user wants to run the program again
        String again="y";
        System.out.println("");
        
        //welcoming message
        System.out.println("Welcome to annual book festival!\n");
        Scanner inputNum=new Scanner(System.in);
        
        //while loop for taking inputs from user until user enters 'n' option
        while(again.equalsIgnoreCase("y")){
            int bill=0;
            
            //input large print value
            System.out.print("Enter the number of large print hardback books purchased: ");
            int largePrintBooks=inputNum.nextInt();
            
            //input small print value
            System.out.print("Enter the number of small print hardback books purchased: ");
            int smallPrintBooks=inputNum.nextInt();
            
            //input softcover value
            System.out.print("Enter the number of softcover books purchased: ");
            int softCoverBooks=inputNum.nextInt();

            //loop to calculate bill for softcover,large and small prints 
            while(largePrintBooks>0){
                if(largePrintBooks>=3){
                    bill+=20;
                    largePrintBooks-=3;
                }else{
                    bill+=largePrintBooks*10;
                    largePrintBooks-=3;
                }
            }
            while(smallPrintBooks>0){
                if(smallPrintBooks>=2){
                    bill+=10;
                    smallPrintBooks-=2;
                }else{
                    bill+=smallPrintBooks*7;
                    smallPrintBooks-=2;
                }
            }
            while(softCoverBooks>0){
                if(softCoverBooks>=5){
                    bill+=15;
                    softCoverBooks-=5;
                }else{
                    bill+=softCoverBooks*5;
                    softCoverBooks-=5;
                }
            }
            //displaying bill
            System.out.println("Your total bill is: $"+bill);
            totalBill+=bill;
            
            //input again or not
            System.out.print("\nWould you like to calculate another bill(y/n)? ");
            again=inputNum.next();
            System.out.println("");
        }
        
        // total bill
        System.out.println("Total sales in this session: $"+totalBill+"\n");
        System.out.println("Goodbye!\n");
    }
    
}
