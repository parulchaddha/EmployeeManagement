package ReadFrom;
import Exceptions.*;
import java.io.*;
import java.util.*;


public class RWfile {
    public static void rwFile(String inputFilePath, String dumpFilePath) throws IOException {

        BufferedWriter dumpFile = new BufferedWriter(new FileWriter(dumpFilePath, true));

        File myObj = new File(inputFilePath);
        Scanner myReader = null;

        // EXCEPTION HANDLING
        try {
            myReader = new Scanner(myObj);
        }
        // IF FILE IS NOT FOUND THE EXCEPTION IS DISPLAYED RATHER THAN CRASHING
        catch (FileNotFoundException ex) {
            System.out.println("exception occurred" + ex);
        }
        // IF FILE EXISTS; READING OF FILE
        while (myReader.hasNextLine()) {

            long id = (long) (Math.random()*100000);

            String data = myReader.nextLine();
            String[] result = data.split("-");

            //MISSING DATA
            if(result.length<3){
                try{
                    throw new CustomException(ConstantErrorMsgs.missingData());
                } catch (CustomException e) {
                    System.out.println(e+": "+data);
                }
                continue;
            }

            //IF THE DATA IN INPUT FILE OF EMPLOYEE HAS EXTRA UNWANTED DETAILS ABOUT THE EMPLOYEE
            else if(result.length>3){
                try{
                    throw new CustomException(ConstantErrorMsgs.extraData());
                } catch (CustomException e) {
                    System.out.println(e+": "+data);
                }
                continue;
            }


            // AFTER ALL THE CHECKS THE STRING TO BE DUMPED IS READY!!
            String dump = Long.toString(id) + "-"+data+"-FileDatasource";
            dumpFile.write(dump+"\n");
        }
        //CLOSING THE FILE
        myReader.close();
        dumpFile.close();
    }
}
