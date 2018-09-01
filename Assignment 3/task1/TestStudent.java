/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStudent{

    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        Scanner getInput = new Scanner(System.in);
        int userChoice;
         File studFile=null;
        String detStudent[];
        try {
            //read data from student text file
             studFile = new File("students.txt");
             FileReader readerF = new FileReader(studFile);

            BufferedReader readerB = new BufferedReader(readerF);
            String eachR;

            while ((eachR = readerB.readLine()) != null) {
                //splitting teh row
                detStudent = eachR.split("\t");
                //creating new student object
                Student stud = new Student(detStudent[0], detStudent[1]);
                //add student to list
                listOfStudents.add(stud);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String nameVar, idVar;

        Scanner getDetails = new Scanner(System.in);
        String menuStr = "******************************************\n1.Press 1 to Add new Student\n2.Press 2 to display all details\n3.Press 3 to quit\n****************************************";
        while (true) {
            System.out.println(menuStr);
            userChoice = getInput.nextInt();

            if (userChoice == 1) {
                FileWriter writerF = null;
                System.out.print("Please Enter the name of Student: ");
                nameVar = getDetails.nextLine();
                System.out.print("Please Enter the id of Student: ");
                idVar = getDetails.nextLine();
                Student stud = new Student(nameVar, idVar);

                if (!stud.isValidId(idVar)) {
                    System.out.println("Error!The id is invalid");

                } else {
                    if (stud.idExists(idVar) != true) {
                        listOfStudents.add(stud);
                        try {

                            writerF = new FileWriter(studFile, true);
                            BufferedWriter writerB = new BufferedWriter(writerF);
                            String st=idVar + "\t" + nameVar;
                            writerB.write(st);
                            writerB.newLine();

                            writerB.close();
                            System.out.println("Details of 1 student addedd!");
                        } catch (Exception ex) {
                            System.out.println("Error!"+ex.getMessage());  }
                    } else {
                        System.out.println("Error!Student Id Already Exist in the system");
                    }
                }
            }
            if (userChoice == 2) {
                for (Student student : listOfStudents) {
                    System.out.printf(student.toString());

                }
            }
            if (userChoice == 3) {
                System.out.println("Thank You!");
                break;
            }
			System.out.println();
        }

    }

}
