import java.util.Scanner;

public class Project12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the Roll Number of the student :");
        int rollno = sc.nextInt();
        System.out.println("Input the marks of Physics, Chemistry and Computer Application ");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int cs = sc.nextInt();  
        System.out.println("Roll No:"+ rollno);
        System.out.println("Marks in Physics:"+ phy);
        System.out.println("Marks in Chemistry:"+ chem);
        System.out.println("Marks in Computer Application:"+ cs);
        int total = phy + chem + cs;
        System.out.println("Total marks :"+ total);
        double per = (total*100)/300;
        System.out.println("Percentage :"+ per);

        if (per>=60 && per<=100) {
            System.out.println("Division = First");
        }
        else if (per>=40 && per<=60) {
            System.out.println("Division = Second");
        }
        else if (per<=40 && per>=30) {
            System.out.println("Division = Third");
        }
        else if (per<30) {
            System.out.println("Division = Fail");
        }
        else{
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
