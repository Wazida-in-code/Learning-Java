public class One_D_Array {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1) * 10;
            System.out.println(arr[i]);
        }
    }
}
