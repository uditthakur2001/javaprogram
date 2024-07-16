import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = input.nextInt();

        if (n==0) {
            System.out.println("m = 0");
        }
        
        else if(n>0){
            System.out.println("m = 1");
        }
        else{
            System.out.println("m = -1");
        }
        input.close();
    }
}
