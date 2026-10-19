public class Loop {
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                // System.out.println(i);
            }
        }

        int j = 1;

        while (j<=10) {
            // System.out.println(j*2 + "");
            j++;
        }

        for (int num = 1; num <= 100; num++){
            if (num % 3 == 0 && num % 5 == 0){
                // System.out.println("FizzBuzz");
            }
            else if (num % 3 == 0){
                // System.out.println("Fizz");
            }
            else if (num % 5 == 0){
                // System.out.println("Buzz");
            }
            else{
                // System.out.println(num);
            }
        }

        int nums = 1;
        while (nums <= 100) {
            if (nums % 3 == 0 && nums % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (nums % 3 == 0){
                System.out.println("Fizz");
            }
            else if (nums % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(nums);
            }
            nums++;
        }
    }
}
