public class BIT_MANIPULATION_EVENORODD {
    public static void evenorodd(int n){
        int mask=1;
        if((n &mask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        evenorodd(100);
    }
    
}
