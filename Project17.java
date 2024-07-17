import java.util.Scanner;

public class Project17 {
     public static void main(String[] args) {
        char letter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        letter = input.next().charAt(0);
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("The alphabet is a vowel.");
        }
        else{
            System.out.println("The alphabet is a consonant.");
        }
        input.close();
     }
}
