import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if (num1==0) {
            System.out.println("Given number is zero");
        }
        
        else if(num1>0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is negative");
        }
        input.close();
    }
}
