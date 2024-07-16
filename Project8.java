import java.util.Scanner;

public class Project8 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter third number");
        num3 = input.nextInt();

        if(num1>num2 && num2>num3){
            System.out.println("The 1st Number is the greatest among three");  
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The 2nd Number is the greatest among three");
        }
        else{
            System.out.println("The 3rd Number is the greatest among three");
        }
        input.close();
    }
    
}