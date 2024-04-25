public class max {
    public static void main(String[] args) {
        int arr[]={10,5,25,45,12};
        int max=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is : "+max);
    }
}
