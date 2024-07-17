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
            System.out.printf("The coordinate point (%d,%d) lies in the First quadrant.",num1,num2);
        }
        else if (num1<0 && num2>0) {
            System.out.printf("The coordinate point (%d,%d) lies in the Second quadrant.",num1,num2);
            
        }
        else if (num1<0 && num2<0) {
            System.out.printf("The coordinate point (%d,%d) lies in the Third quadrant.",num1,num2);
            
        }
        else if(num1>0 && num2<0){
            System.out.printf("The coordinate point (%d,%d) lies in the Fourth quadrant.",num1,num2);
        }
        else{
            System.out.println("Invalid input");
        }
        input.close();
    }
}
