public class SwitchCondition {
    public static void main(String[] args){
        int pages = 100;
        switch (pages - 30) {
            case 100:
                // System.out.println(pages);
                break;
        
            default:
                // System.out.println("small number");
        }

        int num = 20;

        switch (Integer.signum(num)) {
            case 0:
            case 1:
                switch ((num % 2)){
                    case 0:
                        // System.out.println("even");
                        break;
                    default:
                        // System.out.println("Odd");
                }
                break;
            default:
                // System.out.println("negative");
        }

        int age = 19;

        switch (Integer.signum(age)) {
            case 0:
            case 1:
                switch (age - 2) {
                    case 18:
                        // System.out.println("less then 18");
                        break;
                    case 20:
                        // System.out.println("You are 18");
                    default:
                        // System.out.println("Greterthen 18");
                        break;
                }
                break;
            default:
                // System.out.println("You sre not valid");
                break;
        }

        int mark = 100;

        switch ((mark / 10)) {
            case 10:
            case 9:
                // System.out.println("A");
                break;
            case 8:
                // System.out.println("A-");
                break;
            case 7:
                // System.out.println("B");
                break;
            case 6: 
                // System.out.println("B-");
                break;   
            default:
                // System.out.println("You got fail!");
        }

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
