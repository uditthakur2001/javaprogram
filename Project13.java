import java.util.Scanner;

public class Project13 {
     public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree centigrade:");
        temp = input.nextInt();
        if (temp<0) {
            System.out.println("Freezing weather");
        }
        else if (temp>=0 && temp<10) {
            System.out.println("Very Cold weather");
        }
        else if (temp>10 && temp<20) {
            System.out.println("Cold weather");
        }
        else if (temp>20 && temp<30) {
            System.out.println("Normal weather");
        }
        else if (temp>30 && temp<40) {
            System.out.println("Hot weather");
        }
        else if (temp>=40) {
            System.out.println("Very Hot weather");
        }
        else{
            System.out.println("Invalid");
        }
        input.close();
}
}
