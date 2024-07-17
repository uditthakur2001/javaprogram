import java.util.Scanner;

public class Project10 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        num1 = input.nextInt();
        System.out.println("Enter marks of Physics");
        num2 = input.nextInt();
        System.out.println("Enter marks of Chemistry");
        num3 = input.nextInt();

        if(num1>=65 && num2>=55 && num3>=50 && num1+num2+num3>=170 || num1+num2>=140){
            System.out.println("The candidate is eligible for admission.");
        }
        else{
            System.out.println("The candidate is not eligible for admission.");
        }

        input.close();
    }
}
