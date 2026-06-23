// class operators {
//     public static void main(String args[]){
//         int n = 67 ; 
//         System.out.println(op(n));

//     }
//     static boolean op(int  n){
//         return ((n&1)==1) ;
//     }
// }


// public class operators  {

//     public static void main(String[] args) {

//         int[] arr = {2, 3, 4, 3, 2};

//         System.out.println(single(arr));
//     }

//     static int single(int[] arr) {

//         int ans = 0;

//         for (int i = 0; i < arr.length; i++) {
//             ans = ans ^ arr[i];
//         }

//         return ans;
//     }
// }

// public class operators{
//     public static void main(String[] args) {
//         int n = 8; 
//         int ans = 0 ; 
//         int base = 5 ;
//         while(n>0){
//             int last = n&1 ;
//             n = n>> 1 ;
//             ans = ans + last*base ;
//             base = base *5 ;
//         }
//         System.out.println(ans);
//     }
// }


// public class operators {

//     public static void main(String[] args) {

//         int n = 8;

//         if (isPowerOfTwo(n)) {
//             System.out.println("Power of 2");
//         } else {
//             System.out.println("Not a power of 2");
//         }
//     }

//     static boolean isPowerOfTwo(int n) {

//         if (n > 0 && (n & (n - 1)) == 0) {
//             return true;
//         }

//         return false;
//     }
// }

// public class operators{
//     public static void main(String[] args) {
//         for ( int i = 0 ; i< (image[0].length + 1 ) / 2 ;i++){
//             int temp = 
//         }
//     }
// }


// public class operators {

//     public static void main(String[] args) {

//         int n = 20;

//         for (int num = 2; num <= n; num++) {

//             boolean prime = true;

//             for (int i = 2; i < num; i++) {

//                 if (num % i == 0) {
//                     prime = false;
//                 }
//             }

//             System.out.println(num + " -> " + prime);
//         }
//     }
// }

// public class operators{
//     public static void main(String[] args) {
//         int n = 30 ; 
//         for ( int i = 1 ; i<= n ; i++){
//             System.out.println(i + " " +  isprime(i));
//         }
        
//     }
//     static boolean isprime(int n){
//         if (n<=1){
//             return false ;
//         }
//         int c =  2 ;
//         while ( c*c <= n){
//             if ( n % c == 0){
//                 return false ;
//             }
//             c++ ;
//         }
//         return true ;
//     }
// }
public class operators {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                root = m;   // important
                s = m + 1;
            }
        }

        double incr = 0.1;

        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}