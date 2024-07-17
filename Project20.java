import java.util.Scanner;

public class Project20 {
     public static void main(String[] args) {
        char num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade :");
        num = input.next().charAt(0);
        switch(num){
            case 'E':
                System.out.println("Excellent");
                break;
            case 'V':
                System.out.println("Very Good");
                break;
            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default : 
                System.out.println("Invalid Input");
        }

        input.close();
     }
}
