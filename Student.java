 import java.util.Scanner;
  
  public class Student
  {
        public static void main(String args[])
        {
            String name;
            int roll, marks;
  
            Scanner SC=new Scanner(System.in);
  
            System.out.print("Enter Name: ");
            name=SC.nextLine();
            System.out.print("Enter Roll Number: ");
            roll=SC.nextInt();
            System.out.print("Enter marks");
            marks=SC.nextInt();
            System.out.println("Roll Number:"+roll);
            System.out.println("Marks:"+marks);
            System.out.println("name: "+name);
  
        }
  
 }

