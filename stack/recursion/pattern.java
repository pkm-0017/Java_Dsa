import java.util.Arrays ;
public class pattern {
    public static void main(String args[]){
        // triangle(4,0);
        triangle2(4,0);
        int[]arr = {1,5,8,7};
        bubble(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));
    }
    static void triangle(int i , int j ){
        if ( i==0){
            return ;
        }
        if (j<i ){
            System.out.print(" * ");
            triangle( i ,j+1);

        }else{
            System.out.println();
            triangle(i-1 , 0);
        }
    }
static void triangle2(int i, int j) {
    if (i == 0) {
        return;
    }

    if (j < i) {
        triangle2(i, j + 1);
        System.out.print("* ");
    } else {
        triangle2(i - 1, 0);
        System.out.println();
    }
}
static void bubble(int []arr ,int i, int j) {
    if (i == 0) {
        return;
    }

    if (j<i) {
        if ( arr[j] >arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp ;  

        }
        bubble(arr , i , j+1);
    } else {
     bubble(arr , i-1 , 0);
    }
}
}
