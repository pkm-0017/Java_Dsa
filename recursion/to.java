

// public class to {
//     public static void main(String[] args) {
//         print(1);
//     }
//     static void print(int n ){

//         if ( n == 5){
//             System.out.println(5);
//             return ;
//         }
//         System.out.println(n);
//         print(n+1);
//     }
// }
class to {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int ans = search(arr, 0, arr.length - 1, 40);

        System.out.println(ans);
    }

    static int search(int[] arr, int s, int e, int target) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, s, m - 1, target);
        }

        return search(arr, m + 1, e, target);
    }
}