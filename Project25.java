import java.util.Scanner;

public class Project25 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String prompt = "\nPress 0 for square \n" +
        "Press 1 for rectangle \n"+
        "Press 2 for circle \n"+
        "Press 3 for triangle";
        System.out.println(prompt);
        int num3 = input.nextInt(); 
        int num1,num2;
        double area;
        switch (num3) {
            case 0 :
                System.out.println("Enter the side of sqaure");
                num1 = input.nextInt();
                area = num1*num1;
                System.out.println("Area of square = "+area);
                break;
            case 1 :
                System.out.println("Enter the sides of rectangles");
                num1 = input.nextInt();
                num2 = input.nextInt();
                area = num1*num2;
                System.out.println("Area of rectangle = "+area);
                break;
            case 2 :
                System.out.println("Enter the radius of circle");
                num1 = input.nextInt();
                area = num1*3.14;
                System.out.println("Area of circle = "+area);
                break;
            case 3 :
                System.out.println("Enter the base and height of a triangle");
                num1 = input.nextInt();
                num2 = input.nextInt();
                area = .5*(num1*num2);
                System.out.println("Area of triangle = "+area);
                break;
            default :
             System.out.println("Invalid");
        }
        input.close();
    }
}
