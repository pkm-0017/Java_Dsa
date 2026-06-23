// import java.util.Scanner ; 
// public class question{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Tell the number");
//         int n = s.nextInt();
//         int count = 0 ;
// for (int i = 2 ; i<n ; i++){
//     if (n%i==0){
//         count += 1 ;
//     }
    
// }
// if (count == 0){
//         System.out.println("The number is a prime number!" + n ) ;
//     }else{
//         System.out.println("The number is not a prime number" + n);
//     }
//     }
// }
// import java.util.Scanner ;
// public class question{
//     public static void main(String args[]){
// Scanner s = new Scanner(System.in);
// System.out.println("print the number");
// int n = s.nextInt();
// int or = n ; 
// int temp = n ; 
// // finding number of terms
// int digits = 0 ;
// while (temp > 0) {
//             digits++;
//             temp /= 10;
//         }
// System.out.println("Number of digits are:" + digits);
// // sum of a armstrong
// int sum = 0 ;
// temp = n ;
// while(temp>0){
//    int d = temp%10 ;
//     sum +=  Math.pow(d, digits);
//     temp/=10 ;
// }
// if ( or==sum){
//     System.out.println("The number is an armstrong number" + n);        

// }
// else{    System.out.println("The number is not an armstrong number" + n);   
//     }

// }
// }


// import java.util.Scanner ;
// public class question{
//     public static void main(String args[]){ 
// Scanner s = new Scanner(System.in);
// System.out.println("The number is ");
// int n = s.nextInt();
// // find the number od digits
// int temp = n ; 
// int digits = 0 ;
// while(temp>0) {
// digits ++ ;
// temp /= 10 ;
// } 
// System.out.print("The number of digits are:" +digits);

// // calculate the sum
// int O = n ;
// temp = n ; 
// int d ;
// int sum = 0 ;
// while(temp>0){
// d = temp%10 ; 
// sum+= Math.pow(d , digits);
// temp/=10;
// }
// if(O==n){
//     System.out.println("The number is armstring number");
// }else{
//     System.out.println("The number is not armstrong");
// }
//  }
// }
// swap
// class question {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5};

//         swap(arr , 1, 3);

//         // print array after swap
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     static void swap(int[] arr, int index1, int index2) {
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
// }

// max
// import java.util.Scanner;

// public class question{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int[]arr = new int[3];
//         for ( int i = 0 ; i<arr.length ; i++){
// arr[i] = s.nextInt();
//         }
//          int max = a[0] ;
//          for ( int i = 1 ; i<5 ; i++){
//             if ( a[i]>max){
//                 max = a[i];
//             }
//          }
//     }
// }
