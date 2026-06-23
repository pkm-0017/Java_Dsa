// // import java.util.Arrays;
// // import java.util.Scanner;
// // public class arrays {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int[] arr = new int[5];   // array of size 5

// //         System.out.println("Enter 5 numbers:");

// //         // input
// //         for (int i = 0; i < arr.length; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         output first method
// //         System.out.println("Array elements are:");
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.print(arr[i] + " ");

// //         second method
// //         for (int num : arr) {   // for-each loop
// //             System.out.print(num + " ");

// //         th1rd method
// //         System.out.println(Arrays.toString(arr));

// //         }

// //
// import java.util.Scanner;

// public class arrays {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int[][] arr = new int[3][3];

//         // Input
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = s.nextInt();
//             }
//         }

//         // Output (print array)
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.println(arr[i][j] + " ");
//             }
//             System.out.println(); // move to next row
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

// import java.util.Scanner;

// class arrays {
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Type a number:");
//         int x = s.nextInt();
//         System.out.println("You entered: " + x);
//     }
// }