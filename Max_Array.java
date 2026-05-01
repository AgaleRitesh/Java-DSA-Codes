import java.util.Scanner;

public class Max_Array {
    public static void subArray(int arr[]){
        
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
            int current=0;
               
                for(int k=i;k<=j;k++){
                    current+=arr[k];
                System.err.println(current);
                }
                if(current>maxSum) {
                    maxSum=current;
                }
                System.err.println("Maximum Sum is"+maxSum);
            }
            
        }
       
    }

    public static void main(String[] args) {
        System.err.println("Enter no of Array elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.err.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArray(arr);

    
    }
}

