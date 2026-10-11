public class Conditions {
    public static void main(String[] args){
        // System.out.println("Conditions in Java");

        // if
        int age = 10;
        if (age >= 18){
            // System.out.println("You are eligible for vote!");
        }
        // if-else
        int number = 111;
        if (number % 2 == 0){
            // System.out.println(number + " is even");
        }else{
            // System.out.println(number+" is odd");
        }

        // if-else-if
        int money = 10000;
        if (money <= 500){
            // System.out.println("You are avarage person");
        }else if (money == 1000){
            // System.out.println("You are midium person");
        }else{
            // System.out.println("You are a high range person");
        }

        int mark = 75;
        if (mark >= 90) {System.out.println("A");}
        if (mark > 80) {System.out.println("A-");}
        if (mark > 70) {System.out.println("B");}
        else{System.out.println("Not applicable!");}

        int num = 10;
        if (num >= 0){
            if (num % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }else{
            System.out.println("Negative");
        }
    }
}
