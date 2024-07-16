import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        // int result = (num1;num2);
        if (num1>0 && num2>0) {
            System.out.println("The coordinate point" +(num1,num2)+ "lies in the First quadrant.");
        }
        else if (num1<0 && num2>0) {
            System.out.println("The coordinate point" +(num1,num2)+ "lies in the Second quadrant.");
            
        }
        else if (num1<0 && num2<0) {
            System.out.println("The coordinate point" +(num1,num2)+ "lies in the Third quadrant.");
            
        }
        else{
            System.out.println("The coordinate point" +(num1,num2)+ "lies in the Fourth quadrant.");
            
        }
        input.close();
    }
}
