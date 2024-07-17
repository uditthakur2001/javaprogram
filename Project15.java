import java.util.Scanner;

public class Project15 {
     public static void main(String[] args) {
        int angle1,angle2,angle3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of triangle :");
        angle1 = input.nextInt();
        angle2 = input.nextInt();
        angle3 = input.nextInt();
        if((angle1+angle3+angle2)==180){
            System.out.println("The triangle is valid.");
        }
        else{
            System.out.println("The triangle is not valid.");
        }

        input.close();
     }
}
