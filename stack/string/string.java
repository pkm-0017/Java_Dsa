// // public class string {
// //     public static void main(String[] args) {
// //         String a = "Pratik";
// //         String b = "Pratik";
// //         System.out.println(a==b);

// //     String name1 = new String("Pratik");
// //     String name2 = new String("Pratik");
// //     System.out.println(name1==name2);
// //     }
// // }
// // public class string {
// //     public static void main(String[] args) {
// //         String ser = "";
// //         for ( int i = 0 ; i< 26 ; i++){
// //             char ch = (char)('a' + i);
// //             ser = ser + ch ;
// //         }
// //         System.out.println(ser);

// //     }
// // }
// // public class string {
// //     public static void main(String[] args) {
// //         StringBuilder sb = new StringBuilder();
// //         for ( int i = 0 ; i< 26 ; i++){
// //             char ch = (char)('a' + i);
// //             sb.append(ch);
// //         }
// //         System.out.println(sb.toString());
// //     }
// // }

// // import java.util.Arrays;

// // public class string {
// //     public static void main(String[] args) {
// //         String name = "Pratik Mohanty" ;
// //         System.out.println(Arrays.toString(name.split(" ")));
// //     }
// // }
// public class string {
//     public static void main(String[] args) {
//         String ch = "ABCDCBA";

//         System.out.println(pal(ch));
//     }

//     static boolean pal(String ch) {
//         ch = ch.toLowerCase();

//         for (int i = 0; i < ch.length() / 2; i++) {
//             char start = ch.charAt(i);
//             char end = ch.charAt(ch.length() - 1 - i);

//             if (start != end) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
 
