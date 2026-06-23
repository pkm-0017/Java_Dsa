// // public class code{
// //     public static void main(String[] args) {
// //         int [] arr = {12 , 13 ,14 , 15, 16, 17 , 18 } ; 
// //         int target = 17 ;
// //         int ans = binary(arr , target);
// //         System.out.println(ans);
// //     }
// //     static int binary(int[]arr , int target){
// //         int start = 0 ; 
// //         int end = arr.length - 1 ;
// //         while( start<=end){
// //             int mid = start = (end - start) / 2 ;
// //             if ( target < arr[mid]){
// //                 end = mid - 1 ;
// //             }
// //             else if ( target > arr[mid]){
// //                 start = mid + 1 ;
// //             }else{
// //                 return mid ;
// //             }

// //         }
// //         return -1 ;
// //     }
// // }

// // class code {

// //     public static void main(String[] args) {

// //         int[] arr = {10, 20, 30, 40, 50, 60, 70};

// //         int target = 50;

// //         int ans = binarySearch(arr, target);

// //         System.out.println("Index = " + ans);
// //     }

// //     static int binarySearch(int[] arr, int target) {

// //         int start = 0;
// //         int end = arr.length - 1;

// //         while (start <= end) {

// //             int mid = (start + end) / 2;

// //             // element found
// //             if (arr[mid] == target) {
// //                 return mid;
// //             }

// //             // search in right side
// //             if (target > arr[mid]) {
// //                 start = mid + 1;
// //             }

// //             // search in left side
// //             else {
// //                 end = mid - 1;
// //             }
// //         }

// //         return -1;
// //     }
// // }



// class code {

//     public static void main(String[] args) {

//         int[][] arr = {
//                 {1, 3, 5},
//                 {7, 9, 11},
//                 {13, 15, 17}
//         };

//         int target = 11;

//         int[] ans = search(arr, target);

//         System.out.println("i = " + ans[0]);
//         System.out.println("j = " + ans[1]);
//     }

//     static int[] search(int[][] arr, int target) {

//         int i = arr.length;
//         int j = arr[0].length;

//         int start = 0;
//         int end = i * j - 1;

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             int row = mid / j;
//             int col = mid % j;

//             if (arr[row][col] == target) {
//                 return new int[]{row, col};
//             }

//             if (arr[row][col] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }