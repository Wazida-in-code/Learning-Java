import java.util.Scanner;

public class One_D_Array {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1) * 10;
            // System.out.println(arr[i]);
        }



        int[] arr2 = {83, 99, 90, 20, 91};
        boolean found = false;
        Scanner input = new Scanner(System.in);
        int searchValue;
        System.out.print("Enter any number: ");
        searchValue = input.nextInt();

        for(int j=0; j < arr2.length; j++){
            if(arr2[j] == searchValue){
                found = true;
                break;
            }
            
        }

        if(found){
            System.out.println(searchValue + " is found!");
        }else{
            System.out.println(searchValue + " not found!");
        }
    }
}
