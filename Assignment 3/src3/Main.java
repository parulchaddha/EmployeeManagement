import Exceptions.*;
import ReadFrom.*;
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //MAIN MENU
    System.out.println("Select location to Read");
    System.out.println("To read from file,type-1");
    System.out.println("To read from console,type-2");
    System.out.println("To Quit, type-3");

   /* while (true) {
      System.out.print("Enter your choice: ");
      System.out.println(
        "Enter your role:\nPress 1 for FTE \n Press 2 for Intern\n Press 3 for Contractor"
      );
      Scanner role = new Scanner(System.in);
      int a = sc.nextInt();
      if (a == 1) {
        try {
          int choice = sc.nextInt();

          if (choice == 1) {
            RWfile.rwFile(
              "Assignment 2/InputEmpFile.txt",
              "Assignment 2/FTE.txt"
            );
            System.out.println("Data dumped to storage file");
          } else if (choice == 2) {
            RWconsole.rwConsole("Assignment 2/FTE.txt");
            System.out.println("Data dumped to storage file");
          } else if (choice == 3) {
            System.out.println("Program exit");
            break;
          } else {
            System.out.println("Invalid choice : check input");
          }
        } //catch the exception and display
        catch (InputMismatchException ae) {
          System.out.println("Exception:" + ae);
          break;
        } catch (IOException e) {
          throw new RuntimeException(e);
        } catch (CustomException ex) {
          System.out.println("Exception:" + ex);
        }
      }

      if (a == 2) {
        try {
          int choice = sc.nextInt();

          if (choice == 1) {
            RWfile.rwFile(
              "Assignment 2/InputEmpFile.txt",
              "Assignment 2/Intern.txt"
            );
            System.out.println("Data dumped to storage file");
          } else if (choice == 2) {
            RWconsole.rwConsole("Assignment 2/Intern.txt");
            System.out.println("Data dumped to storage file");
          } else if (choice == 3) {
            System.out.println("Program exit");
            break;
          } else {
            System.out.println("Invalid choice : check input");
          }
        } //catch the exception and display
        catch (InputMismatchException ax) {
          System.out.println("Exception:" + ax);
          break;
        } catch (IOException e) {
          throw new RuntimeException(e);
        } catch (CustomException ex) {
          System.out.println("Exception:" + ex);
        }
      }

      if (a == 3) {
        try {
          int choice = sc.nextInt();

          if (choice == 1) {
            RWfile.rwFile(
              "Assignment 2/InputEmpFile.txt",
              "Assignment 2/Contractor.txt"
            );
            System.out.println("Data dumped to storage file");
          } else if (choice == 2) {
            RWconsole.rwConsole("Assignment 2/Contractor.txt");
            System.out.println("Data dumped to storage file");
          } else if (choice == 3) {
            System.out.println("Program exit");
            break;
          } else {
            System.out.println("Invalid choice : check input");
          }
        } //catch the exception and display
        catch (InputMismatchException ap) {
          System.out.println("Exception:" + ap);
          break;
        } catch (IOException e) {
          throw new RuntimeException(e);
        } catch (CustomException ex) {
          System.out.println("Exception:" + ex);
        }
      } else {
        System.out.println("Please enter a valid input");
      }
    }*/
    while(true){
      int choice = sc.nextInt();
      System.out.print("Enter your choice: ");
      System.out.println("Enter your role:\nPress 1 for FTE \n Press 2 for Intern\n Press 3 for Contractor");
      int a = sc.nextInt();
      try{
          if(a==1){
              if(choice == 1){
                  RWfile.rwFile("src3/InputEmpFile.txt","src3/FTE.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("src3/FTE.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 3){
                  System.out.println("Program exit");
                  break;
              }else{
                  System.out.println("Invalid choice : check input");
              }
          }
          if(a==2){
              if(choice == 1){
                  RWfile.rwFile("src3/InputEmpFile.txt","src3/Intern.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("src3/Intern.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 3){
                  System.out.println("Program exit");
                  break;
              }else{
                  System.out.println("Invalid choice : check input");
              }
          }
          if(a==3){
              if(choice == 1){
                  RWfile.rwFile("src3/InputEmpFile.txt","src3/Contractor.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("src3/Contractor.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 3){
                  System.out.println("Program exit");
                  break;
              }else{
                  System.out.println("Invalid choice : check input");
              }
          }
      }
      //catch the exception and display
      catch(InputMismatchException ap) {
          System.out.println("Exception:" + ap);
          break;
      }
      catch (IOException e) {
          throw new RuntimeException(e);
      }
      catch (CustomException ex){
          System.out.println("Exception:" + ex);
      }
  }
  }
}
