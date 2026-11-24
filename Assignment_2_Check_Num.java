import java.util.Scanner;

public class Assignment_2_Check_Num {
    public static void main(String[] args){
        double number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        number = input.nextDouble();

        if(number > 0){
            System.out.println(number + " is a positive number.");
        }else if(number < 0){
            System.out.println(number + " is a negative number.");
        }else{
            System.out.println("The number is Zero(0).");
        }
    }
}
