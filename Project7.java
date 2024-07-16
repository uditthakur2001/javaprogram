import java.util.Scanner;
public class Project7 {
    public static void main(String[] args) {
        double num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        
        if (num1<150) {
            System.out.println("The person is Dwarf");
        }
        
        else if(num1>=150 && num1<=180){
            System.out.println("The person is Medium");
        }
        else{
            System.out.println("The person is Tall");
        }
        input.close();
    }

}
