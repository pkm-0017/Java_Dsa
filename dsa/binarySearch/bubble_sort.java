// import java.util.Arrays;

// public class bubble_sort {

//     public static void main(String args[]) {

//         int[] arr = {10, 10 , 10 , 10};

//         bubble(arr);

//         System.out.print(Arrays.toString(arr));
//     }

//     static void bubble(int[] arr) {

//         // run the steps n-1 times
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 1; j < arr.length - i; j++) {

//                 // swap if current item is smaller
//                 if (arr[j] < arr[j - 1]) {

//                     // swap
//                     int temp = arr[j];

//                     arr[j] = arr[j - 1];

//                     arr[j - 1] = temp;
//                 }
//             }
//         }
//     }
// }