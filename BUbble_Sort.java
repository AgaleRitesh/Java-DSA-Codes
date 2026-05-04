public class BUbble_Sort {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp; 
                }

            }
        }

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]);
        }
        System.err.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={8,4,1,3,2};
    bubblesort(arr);
    //System.err.println(bubblesort(arr));
    printarr(arr);
    }
    
}
