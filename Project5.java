import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age=sc.nextInt();

        if (age>=18) 
        {
            System.out.println("You can vote!");
        }
        else
        {
            System.out.println("You can't vote!");
        }
        sc.close();
    }
}
