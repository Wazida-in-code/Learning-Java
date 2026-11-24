import java.util.Scanner;

public class Assignment_2_Circle_Area {
    public static void main(String[] args){
        double radius;
        double area; 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = Math.PI * (radius * radius);

        System.out.println("The Area of the Circle: " + area);
    }
}
