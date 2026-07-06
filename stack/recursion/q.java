
import java.util.ArrayList;

// public class q{
//     public static void main(String args[]){
//         int[]arr = { 12, 13 , 20 ,15  , 16};
//         System.out.print(sorted(arr,0));
//     }
//     static boolean sorted(int[]arr , int c){
//         if ( c == arr.length-1 ){
//             return true ;
//         }
//         return arr[c]<arr[c+1] && sorted(arr , c+1);
//     }
// }

public class q{
    public static void main(String agrs[]){
        int[]arr = {12,13,154,16,17,18 , 16};

        // System.out.println(linear( arr, 12,0));
        // System.out.print(lin( arr, 154 , arr.length - 1));
        // findi(arr , 18 , 0);

        
System.out.println(findnew(arr , 16 , 0 , new ArrayList<>()));
    }
    static boolean linear(int[]arr , int target, int i ){
        if (i==arr.length){
            return false ;
        }
         
        return arr[i]==target || linear(arr, target , i+1);
    }
    static int  lin(int[]arr , int target, int i ){
        if (i==-1){
            return -1;
        }
         if (arr[i]==target ){
            return i;
         }
         return  lin(arr, target , i-1);

    }
static ArrayList<Integer> list = new ArrayList<>();
static void findi(int[]arr ,int target , int i){
    if ( i == arr.length){
        return ;
    }
    if ( arr[i] == target){
        list.add(i);
    }
    findi(arr,target , i+1);
}
static ArrayList<Integer> findnew(int[] arr,
                                  int target,
                                  int i,
                                  ArrayList<Integer> List) {

    if (i == arr.length) {
        return list;
    }

    if (arr[i] == target) {
        list.add(i);
    }

    return findnew(arr, target, i + 1, list);
}
}
