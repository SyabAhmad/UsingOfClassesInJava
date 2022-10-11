import java.util.Scanner;


public class Main {
    public class studentData{
        public String studentName;
        public byte studentAge;
        public String studentEmail;
        public int studentRollNumber;

    }
    studentData data = new studentData();
    Scanner reader = new Scanner(System.in);
    void inPut(){
        System.out.println("Enter Your Name: ");
        data.studentName = reader.nextLine();
        System.out.println("Enter Your E-Mail: ");
        data.studentEmail = reader.nextLine();
        System.out.println("Enter Your Age: ");
        data.studentAge = reader.nextByte();
        System.out.println("Enter Your Roll Number: ");
        data.studentRollNumber = reader.nextInt();

    }
    void outPut(){
        System.out.println("Your Name: " + data.studentName);
        System.out.println("Your E-Mail: " + data.studentEmail);
        System.out.println("Your Age: " + data.studentAge);
        System.out.println("Your Roll Number: " + data.studentRollNumber);
    }
    public static void main(String[] args) {
        System.out.println("Classes Inheritance practical");
        Main mainPublicClass = new Main();
        mainPublicClass.inPut();
        mainPublicClass.outPut();
    }
    
}