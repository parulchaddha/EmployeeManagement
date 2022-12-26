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


    while(true){
      int choice = sc.nextInt();
      System.out.print("Enter your choice: ");
      System.out.println("Enter your role:\nPress 1 for FTE \n Press 2 for Intern\n Press 3 for Contractor");
      int a = sc.nextInt();
      try{
          if(a==1){
              if(choice == 1){
                  RWfile.rwFile("InputEmpFile.txt","FTE.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("FTE.txt");
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
                  RWfile.rwFile("InputEmpFile.txt","Intern.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("Intern.txt");
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
                  RWfile.rwFile("InputEmpFile.txt","Contractor.txt");
                  System.out.println("Data dumped to storage file");
              }else if(choice == 2){
                  RWconsole.rwConsole("Contractor.txt");
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
  sc.close();
  }
}
