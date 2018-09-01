

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStaff {

    public static void main(String[] args) {
        /*
        instance of scanner class and arraylist to store staff objects
         */
        Scanner getInput = new Scanner(System.in);
        ArrayList<Staff> listSatffObj = new ArrayList<>();
        FileReader readerF;
        BufferedReader readerB;
        String eachLine;
        String menuStr = "\n1.Display Full-time Staff Details\n2.Display Part-time Staff Details\n3.Display Casual Staff Details\n4.Display Details of all staff\n5.Exit";
        int userOp;
        try {
            /*
            read data from staff text file
             */
            readerF = new FileReader(new File("staff.txt"));
            readerB = new BufferedReader(readerF);

            /*
            read each row and create corresponding objects
             */
            while ((eachLine = readerB.readLine()) != null) {
                String allCols[] = eachLine.split("\t");
                String firstCol = allCols[0];
                //check if first column contains part
                if (firstCol.equals("part")) {

                    listSatffObj.add(new PartTimeStaff(allCols[1], allCols[2], allCols[3], Double.parseDouble(allCols[4])));

                }
                //check if first column contains full
                if (firstCol.equals("full")) {

                    listSatffObj.add(new FullTimeStaff(allCols[1], allCols[2], allCols[3], allCols[4]));

                }
                //check if first column contains casual
                if (firstCol.equals("casual")) {

                    listSatffObj.add(new CasualStaff(allCols[1], allCols[2], allCols[3], Integer.parseInt(allCols[4])));
                }

            }

        } catch (Exception expt) {

            expt.printStackTrace();
        }
        //loop to display the menu continously until user chooses to exit
        do {
            //display teh menu string 
            System.out.println(menuStr);
            //prompt user to enter choice 
            System.out.print("Enter your choice :  ");

            userOp = getInput.nextInt();
			
			//display the details of full time staff
            if (userOp == 2) { 
			//display the details of Part time staff 			
                for (Staff eachStaff : listSatffObj) {
                    if (eachStaff.getClass().getName().toString().equals("PartTimeStaff")) {
                        System.out.println(eachStaff.toString());
                    }
                }
            } else if (userOp == 1) {   

                for (Staff eachStaff : listSatffObj) {

                    if (eachStaff.getClass().getName().toString().equals("FullTimeStaff")) {
                        System.out.println(eachStaff.toString());
                    }
                }
            } else if (userOp == 4) {   //display all staff details

                for (Staff eachStaff : listSatffObj) {
                    System.out.println(eachStaff.toString());
                }

            } else if (userOp == 3) {
			//display the details of Casual Staff 
                for (Staff eachStaff : listSatffObj) {
                    if (eachStaff.getClass().getName().toString().equals("CasualStaff")) {
                        System.out.println(eachStaff.toString());
                    }
                }
            } else {
                System.out.println("This option is not available in the menu");
            }

        } while (userOp != 5);

    }
}
