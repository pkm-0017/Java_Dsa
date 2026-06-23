// public class question{
//     public static void main(String[] args) {
//         fn(5);
//         fn1(5);
//     }
//     static void fn(int n){
//         if ( n==0){
//             return ;
//         }
//         System.out.print( n + " " );
//         fn(n-1);
//     }

//      static void fn1(int n){
//         if ( n==0){
//             return ;
//         }
     
//         fn1(n-1);

//         System.out.print( n + " " );
//     }
// }
// public class question{
//     public static void main(String[] args) {
//        int ans = fac(5);
//        System.out.println(ans);
//     }
//     static int fac(int n){
//         if ( n == 0 || n == 1){
//             return 1 ;
//         }
     
//         return n * fac(n-1);
    

//     }
// }

public class question{
    public static void main(String[] args) {
        sum1(1342);
       int ans = sum2(1342);
       System.out.println("Sum of " + ans);
       int ans2 = pro(1342);
       System.out.println("Ans " + ans2);
       rev(1234);
    
    System.out.print(count(12010));

    System.out.println(reduce1(12));
    }
    static void sum1(int n){
        int rem ; 
        int sum = 0 ;
        while(n>0){
            rem = n%10 ;
            sum = sum + rem ;
            n/=10 ; 
        }
        System.out.println("Sum " + sum);
    }
    static int sum2(int n ){
        if ( n == 0){
            return 0 ;
        }
        return (n%10) + sum2(n/10);
    }

        static int pro(int n ){
        if ( n%10 == n){
            return n ;
        }
        return (n%10) * pro(n/10);
    }
   static  int sum = 0 ;
    static void rev(int n ){
        if ( n== 0){
            return ;
        }
        int rem = n %10 ;
        sum = sum*10 + rem ;
        rev(n/10);
    }
    static int count(int n){
        return helper(n , 0);
    }
    private static int helper(int n , int c){
        if (n==0){
            return c ; 
        }
        int rem = n % 10 ; 
        if ( rem==0){
            return helper(n/10 , c+ 1);
        }
        return helper(n/10 , c);
    }

    static int reduce1(int n){
        return helper1(n , 0);
    }
    private static int helper1(int n , int c){
        if ( n == 0){
            return c ;
        }
        if ( n % 2==0){
            return helper1(n/2 , c+1);
        }
        return helper1(n-1 , c+1);
 
    }
}