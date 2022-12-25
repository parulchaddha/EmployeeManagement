package ReadFrom;
import Exceptions.*;
import java.io.*;
import java.util.*;


public class RWconsole {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void rwConsole(String FtePath) throws CustomException {

        long id = (long) (Math.random()*100000);

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee id generated is "+id);

        System.out.print("Enter Employee Name:  ");
        String name = sc.nextLine();
        if (isNumeric(name)){
            throw new CustomException(ConstantErrorMsgs.nameInputNumeric());
        }

        System.out.print("Enter Employee Department:  ");
        String dept = sc.nextLine();
        if (isNumeric(dept)){
            throw new CustomException(ConstantErrorMsgs.deptInputNumeric());
        }

        System.out.print("Enter Employee Manager:  ");
        String manager = sc.nextLine();
        if (isNumeric(manager)){
            throw new CustomException(ConstantErrorMsgs.managerInputNumeric());
        }

        // CREATING THE FINAL DUMP STRING WHICH WILL BE ADDED TO THE STORAGE(DUMP) FILE WITH EMPLOYEE DETAILS
        String fte = Long.toString(id) + "-" + name + "-" +dept+ "-" + manager+ "-" + "ConsoleDatasource";
        try {
            BufferedWriter Fte = new BufferedWriter(new FileWriter(FtePath, true));
            Fte.write(fte+"\n");
            Fte.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
