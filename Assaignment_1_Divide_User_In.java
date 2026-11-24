import java.util.Scanner;

public class Assaignment_1_Divide_User_In {
    public static void main(String[] args){
        int firstNum;
        int secondNum;
        int divide;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        firstNum = input.nextInt();

        System.out.print("Enter your second number: ");
        secondNum = input.nextInt();

        divide = firstNum / secondNum;

        System.out.println("The value is: " + divide);
    }
}
