import java.util.Arrays;
public class binearysearch {
    public static void main(String[] args) {
        int arr[]={10,25,50,42,38,64,12,24,5,1};
        Arrays.sort(arr);
        binarySearch(arr, 5);
    }
    public static void binarySearch(int arr[],int data){
        int low=0,high=arr.length-1; 
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<data){
                low=mid+1;
            }else if(arr[mid]>data){
                high=mid-1;
            }else{
                low=mid;
                flag=true;
                System.out.println("Element found at index "+low);
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }
}