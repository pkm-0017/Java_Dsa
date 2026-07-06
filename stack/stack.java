public class stack {
    protected int[] data ; 
    private static final int DEFAULT_SIZE = 10;
    public stack(){
        this(DEFAULT_SIZE);
    }
    public stack(int size){
        this.data = new int[size];
    }
}
