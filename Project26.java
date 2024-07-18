import java.util.Scanner;

public class Project26 {

    public static void main(String[] args){
        int num1, num2, num3;
        System.out.println("Enter the first number");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt(); 
        System.out.println("Enter the second number");
        num2 = input.nextInt(); 
        System.out.println("Entered values are:");
        System.out.println(num1);
        System.out.println(num2);
        String prompt = "\nPress 0 for addition \n" +
        "Press 1 for subtraction \n"+
        "Press 2 for multiplication \n"+
        "Press 3 for division \n"+
        "Press 4 for mod";
        System.out.println(prompt);
        num3 = input.nextInt(); 
        switch (num3) {
            case 0 -> System.out.println(num1+num2);
            case 1 -> System.out.println(num1-num2);
            case 2 -> System.out.println(num1*num2);
            case 3 -> System.out.println(num1-num2);
            case 4 -> System.out.println(num1%num2);

            default -> System.out.println("Invalid");
        }
        input.close();
    }
}
