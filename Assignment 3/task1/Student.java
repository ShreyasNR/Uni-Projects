

import java.io.*;

public class Student {

    /* feilds to store name and id*/
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /*getters for fields*/
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    /*setters for fields*/
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("\n%-20s %-20s", this.id, this.name);

    }

    //method to check the id is valid 
    public boolean isValidId(String sId) {
        int idLen = sId.length();//get the length of student id 
        boolean status = false;
        //check if teh length is  6 or not
        if (idLen != 6) {
            
            status = false;
        } else {
            //chekc if the srudent id contains numbers only
            for (int counter = 0; counter < sId.length(); counter++) {
                if (sId.matches("\\d+")) {
                    status = true;
                } else {
                    //if not then set the status to false
                    status = false;
                    break;
                }

            }
        }
        //return the status
        return status;

    }

    public boolean idExists(String studId) {
        boolean isExist = false;
       String arrDetails[] ;
        try {
            //read dtudent text file
        
            BufferedReader readerB = new BufferedReader(new FileReader(new File("students.txt")));
            String eachRow = "";

            while ((eachRow = readerB.readLine()) != null) {
                //split each row and store into array 
                arrDetails= eachRow.split("\t");
                //chekc if the id alreday there in teh file
                if (arrDetails[0].equals(studId)) {
                    isExist = true;
                    break;
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //return the status that id exist or not
        return isExist;

    }

}
