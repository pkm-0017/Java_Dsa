// // min and max elemenst in an array 
// class quest1{
//     public static void main(String args[]){
//         int[]arr ={12,13,145,16,17};
//         minmax(arr);
//     }
//     static void minmax(int[]arr){
//         int min = arr[0];
//         int max = arr[0];
//         for ( int i = 1 ; i<arr.length ; i++){
//             if (arr[i]<min){
//                 min = arr[i];
//             }if (arr[i]>max){
//                 max = arr[i];
//             }
//         }
//     System.out.println("Max is " + max);
//     System.out.print("Min is " + min);
//     }
// }

import java.util.Arrays;

public class quest1{
    public static void main(String[] args) {
        int[]arr = {12,14,15,2,1,18};
        arrayreverse(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void arrayreverse(int[]arr , int start , int end){
        if ( start>=end){
            return ;
        }
        int temp = arr[start] ; 
        arr[start] = arr[end];
        arr[end] = temp ; 
        arrayreverse(arr , start +1 , end-1);
        }
}