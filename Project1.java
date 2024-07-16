import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();

        if(num1==num2){
            System.out.println("Numbers are equal");  
        }
        else{
            System.out.println("Numbers are not equal");
        }
        input.close();
    }
    
}