import java.util.Scanner;

public class Assaignment_1_Sum_User_In {
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        num2 = input.nextInt();
        
        sum = num1 + num2;

        System.out.println("Total Number: " + sum);
    }
}
