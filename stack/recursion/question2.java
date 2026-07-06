// import java.util.Arrays;

// public class question2 {
//     public static void main(String[] args) {
//         int[]arr = {5, 4, 3, 2, 1};

//         // System.out.println(Arrays.toString(merge(arr)));
//         System.out.println(Arrays.toString(merge(new int[]{5, 4, 3, 2, 1})));
//     }

//     static int[] merge(int[] arr) {
//         if (arr.length == 1) {
//             return arr;
//         }

//         int mid = arr.length / 2;

//         int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

//         return merge(left, right);
//     }

//     static int[] merge(int[] first, int[] second) {
//         int[] mix = new int[first.length + second.length];

//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while (i < first.length && j < second.length) {
//             if (first[i] < second[j]) {
//                 mix[k] = first[i];
//                 i++;
//             } else {
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < first.length) {
//             mix[k] = first[i];
//             i++;
//             k++;
//         }

//         while (j < second.length) {
//             mix[k] = second[j];
//             j++;
//             k++;
//         }

//         return mix;
//     }
// }

import java.util.Arrays;

public class question2{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int[]ans = mergesort(arr);

        System.out.println(Arrays.toString(ans));
    }
    static int[]mergesort(int[]arr){
        if ( arr.length ==1 ){
            return arr ;
        }
        int m = arr.length / 2 ;

        // divide the array into two half
        int[]left = mergesort(Arrays.copyOfRange(arr, 0, m)); 
        int[]right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left , right);
    }
    static int[] merge(int[]first , int[]second ){
        int[]mix = new int[first.length + second.length];
        int i = 0 ; 
        int j = 0 ; 
        int k = 0 ;
        // comapare i and k , both arr first element
        while(i<first.length && j<second.length){
            if ( first[i]<second[j]){
                mix[k] = first[i];
                i++ ;
            }else{
                mix[k] = second[j];
                j++ ;
        }
        k++ ;
    }
    // copy of remaining elements 
    while(i<first.length ){
        mix[k] = first[i];
        i++ ; 
        k++ ;
    }
       // copy of remaining elements 
    while(j<first.length ){
        mix[k] = first[i];
        j++ ; 
        k++ ;

    }
    return mix ;
}
}