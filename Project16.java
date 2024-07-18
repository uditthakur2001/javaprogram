import java.util.Scanner;

public class Project16 {
     public static void main(String[] args) {
        char var;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input :");
        var = input.next().charAt(0);

        if (var>='a' && var<='z' || var>='A' && var<='Z') {
            System.out.println("Alphabet");
        }
        else if (var>='0' && var<='9')  {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }

        input.close();
     }
}
