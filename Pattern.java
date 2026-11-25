public class Pattern {
    public static void main(String[] args){
        // for (int i = 0; i<5; i++){
        //     for (int j = 0; j<5; j++){
        //         System.out.print(" #");
        //     }
        //     System.out.println();
        // }
        
        for(int t = 1; t <= 5; t++){
            for(int e = 1; e <= t; e++){
                System.out.print(" " + e);
            }
            System.out.println();
        }
    }
}
