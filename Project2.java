import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if (num1%2==0) {
            System.out.println("Given number is even");
        }
        
        else{
            System.out.println("Given number is odd");
        }
        input.close();
    }
}
