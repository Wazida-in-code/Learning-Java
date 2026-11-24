import java.util.Scanner;

public class Assignment_2_Rectangle_Area {
    public static void main(String[] args){
        int hight;
        int width;
        int area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hight of the rectangle: ");
        hight = input.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();

        area = hight * width;
        System.out.print("The value of the rectangle is: " + area);
    }
}
