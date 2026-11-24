import java.util.Scanner;

public class Assignment_2_Square_Num {
    public static void main(String[] args){
        int nums;
        int square;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the square number: ");
        nums = input.nextInt();

        square = nums * nums;
        System.out.println("The square value is: " + square);
    }
}
