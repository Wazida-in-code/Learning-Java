import java.util.Scanner;

public class Assaignment_1_Sub_User_In {
    public static void main(String[] args){
        int firstNum;
        int secondNum;
        int sub;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstNum: ");
        firstNum = input.nextInt();

        System.out.print("Enter your secondNum: ");
        secondNum = input.nextInt();

        sub = firstNum - secondNum;
        System.out.println("The subtract value is: " + sub);
    }
}
