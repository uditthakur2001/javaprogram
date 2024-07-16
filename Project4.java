import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if (num1%4==0 || num1%100==0) {
            System.out.println("Given year is leap year");
        }
        
        else{
            System.out.println("Given year is not a leap year");
        }
        input.close();
    }
}
