// public class linear {
//     public static void main(String [] args) {
//         int[] nums = {1,2,3,4,5,6,7,8,9,04,44,32,12,1414,1456};
//         int target = 44 ; 
//         int ans = linear(nums, target);
//         System.out.println(ans);
//     }
//     static int linear(int[] arr , int target){
//         if (arr.length==0){
//             return -1 ;
//         }
//         for ( int i = 0 ; i<arr.length ; i ++){
//             if (arr[i]==target){
//                 return i ;
//             }
//         }
//         return -1 ;
//     }
// }
// public class linear {
//     public static void main(String[] args) {
//         String name = "Pratik";
//         char target = 'P';

//         boolean result = search(name, target);
//         System.out.println(result);
//     }

//     static boolean search(String str, char target) {
//         if (str.length() == 0) {
//             return false;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             if (target == str.charAt(i)) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

// // public class linear{
// //     public static void main(String[] args) {
// //         String name = "Pratik";
// //         char target = 'P';  
// //         boolean  ans = search(name , target);
// //          System.out.println(ans);

// //     }
// //     static boolean search(String str , char target){
// //         if(str.length()==0){
// //             return false ;
// //         }
// //         for ( int i = 0  ; i<str.length() ; i++){
// //             if ( target == str.charAt(i)){
// //             return true ;
// //         }
// //     }
// //     return false ; 
// // }
// // }
// public class linear{
// public static void main(String[] args){
//     int[] arr = {1,2,3,4,55,6,7,-7};
//     System.out.print("The minimun number in thr array is :" +min(arr));
// }
// static int min(int[]arr){
//     int min = arr[0];
//     for ( int i = 0 ;i<arr.length ; i++){
//         if ( min>arr[i]){
//             min = arr[i];
//         }
//     }
//     return min ;
// }
// }




// public class linear {
//     public static void main(String[] args) {

//         int[][] arr = {
//                 {10, 20, 30},
//                 {40, 50, 60},
//                 {70, 80, 90}
//         };

//         int target = 50;

//         for (int row = 0; row < arr.length; row++) {

//             for (int col = 0; col < arr[row].length; col++) {

//                 if (arr[row][col] == target) {

//                     System.out.println("Element found!");
//                     System.out.println("Row index: " + row);
//                     System.out.println("Column index: " + col);
//                     System.out.println("Location: [" + row + "][" + col + "]");

//                 }
//             }
//         }
//     }
// }
// class linear{
//     public static void main(String[] args) {
//         int [] nums = {12,111,1345,13};
//         for ( int i = 0 ; i<nums.length ; i++) {
//             System.out.println(nums[i] + " -> "  + TF(nums[i])) ;
//         }
//     }
//     static boolean TF (int nums){
//         int d = check(nums);
//         if ( d%2==0){
//             return true ;
//         }
//         return false ;
//     }
//     static int check (int nums){
//         int count = 0 ; 
//         while ( nums>0){
//             count ++ ; 
//             nums = nums / 10 ;
//         }
//         return count ;
//     }
// }