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
        char value = (char) decimal;
        // System.out.println(value);
        for(int c=1; c <= 5; c++){
            for(int b=1; b <= c; b++){
                value = (char) (decimal + b - 1);
                System.out.print(" " + value);
                System.out.print(" " + decimal);
                System.out.print(" " +b);
                System.out.print("----------");
            }
            System.out.println();
        }
    }
}
