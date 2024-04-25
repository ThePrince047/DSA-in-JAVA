public class selectionsort{
    public static void main(String[] args) {
        int[] arr={10,25,50,42,38,64,12,24,5,1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int arr1:arr){
            System.out.print(arr1 + " ");
        }
    }
}
