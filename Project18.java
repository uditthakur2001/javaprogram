import java.util.Scanner;
public class Project18 {
    public static void main(String[] args) {
        int profit,loss;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of credit :");
        profit = input.nextInt();
        System.out.println("Enter the value of debit :");
        loss = input.nextInt();
        if(profit<loss){
            System.out.println("Loss of "+ (loss-profit));
        }
        else{
            System.out.println("Profit of "+ (profit-loss));
        }
        input.close();
    }
}
