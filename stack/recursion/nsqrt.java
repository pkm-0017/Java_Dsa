// // public class nsqrt {
// //     public static void main(String args[]){
// //         System.out.println(sqrt(40));
// //     }  
// //     static double sqrt(double n){
// //         double x = n ; 
// //         double root ;
// //         while(true){
// //             root = 0.5 * (x+(n/x));

// //             if (Math.abs(root-x)< 0.5){
// //                 break ;
// //             }
// //             x = root ;
// //         }
// //         return root ;
// //     }
// // }
// import java.util.ArrayList;

// public class nsqrt {

//     public static void main(String[] args) {
//         fact2(40);
//     }

//     static void fact2(int n) {

//         ArrayList<Integer> list = new ArrayList<>();

//         for (int i = 1; i <= Math.sqrt(n); i++) {

//             if (n % i == 0) {

//                 if (n / i == i) {
//                     System.out.print(i + " ");
//                 } else {

//                     System.out.print(i + " ");

//                     list.add(n / i);
//                 }
//             }
//         }

//         for (int i = list.size() - 1; i >= 0; i--) {
//             System.out.print(list.get(i) + " ");
//         }
//     }
// }

import java.util.Arrays;
import java.util.HashMap;

class nsqrt {
    public static void main(String args[]) {
        int[] arr = {2, 7, 11, 15};

        System.out.print(Arrays.toString(sum(arr, 9)));
    }

    static int[] sum(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int req = target - arr[i];

            if (hm.containsKey(req)) {
                return new int[] {hm.get(req), i};
            }

            hm.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }
}