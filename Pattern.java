public class Pattern {
    public static void main(String[] args){
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                // System.out.print(" #");
            }
            // System.out.println();
        }
        
        for(int t = 1; t <= 5; t++){
            for(int e = 1; e <= t; e++){
                // System.out.print(" " + e);
            }
            // System.out.println();
        }

        int decimal = 97;
        char value = (char) decimal; // print alphabet
        // System.out.println(value);
        for (int e = 1; e <= 5; e++){   //outer loop
            for (int t = 1; t <= e; t++){   // inner loop
                value = (char) (decimal + t - 1);  // 97 + t - 1
                // System.out.print(" " + value);
            }
            // System.out.println();
        }
            // System.out.println("----------");
        for (int e = 1; e <= 5; e++){   //outer loop
            for (int t = 1; t <= e; t++){   // inner loop
                value = (char) (decimal + e - 1);  // 97 + e - 1
                // System.out.print(" " + value);
            }
            // System.out.println();
        }


        for(int a = 1; a <= 5; a++){
            for(int b=1; b <= a; b++){
                System.out.print(" " + b);
            }
            System.out.println();
        }

        System.out.println("---------------->");

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for(int a = 5; a >= 1; a--){
            for(int b = 1; b <= a; b++){
                System.out.print(" " + b);
            }
            System.out.println();
        }
    }
}
