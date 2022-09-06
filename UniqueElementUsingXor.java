public class UniqueElementUsingXor {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,1,2,3,4};
//        int length = arr.length;
//        Arrays.sort(arr);
//        int i =0;
//        for(i = 1; i<length-1;i++){
//            if((arr[i]^arr[i-1])!=0){ // if arr[i] and arr[i-1] is equal it leave, if not equals it will print the value arr[i]
//                System.out.print(arr[i-1]+" ");
//            }
//        }
        int unique=0;
        for(int n: arr)
            unique ^= n;

        System.out.println(unique);
//           System.out.print(arr[i-1]+" ");
    }
}
