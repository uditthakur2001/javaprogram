import java.util.Scanner;

public class Project19 {

    public static void main(String[] args){
        int id;
        double bill, unit;
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the Customer Id");
        id = input.nextInt(); 
        // System.out.println("Enter the unit consumed");
        unit = input.nextDouble(); 
        System.out.println("Customer Id : "+ id);
        System.out.println("Unit Consumed : "+ unit);

        if (unit<=199 && unit>62.5) {
            bill = unit*3.20;
            System.out.println("Amount Charges @Rs. 3.20 per unit : "+ bill);
        }
        else if (unit>=400 && unit<600) {
            bill = unit*8.80;
            System.out.println("Amount Charges @Rs. 8.80 per unit : "+ bill);
            if (bill>1000) {
                double surcharge = (bill*15)/100;
                System.out.println("Surcharge Amount : "+ surcharge);
                double sum = bill + surcharge;
                System.out.println("Net Amount Paid By the Customer : "+ sum);
            }
        }
        else if (unit<400 && unit>=200) {
            bill = unit*5.50;
            System.out.println("Amount Charges @Rs. 5.50 per unit : "+ bill);
            if (bill>1000) {
                double surcharge = (bill*15)/100;
                System.out.println("Surcharge Amount : "+ surcharge);
                double sum = bill + surcharge;
                System.out.println("Net Amount Paid By the Customer : "+ sum);
            }
        }
        else if (unit>=600) {
            bill = unit*9.00;
            System.out.println("Amount Charges @Rs. 9.00 per unit : "+ bill);
            if (bill>1000) {
                double surcharge = (bill*15)/100;
                System.out.println("Surcharge Amount : "+ surcharge);
                double sum = bill + surcharge;
                System.out.println("Net Amount Paid By the Customer : "+ sum);
            }
        }
        else{
            System.out.println("Net Amount Paid By the Customer : 200");
        }
        

        input.close();
    }
}
