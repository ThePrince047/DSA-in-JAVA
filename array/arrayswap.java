public class arrayswap {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int[] arr2={1,2,3,4,5};
        int i=1,j=1;
       // swap(arr,i,j);
        swap2(arr,arr2,i,j);
    }
    public static void swap2(int[] one,int[] two,int i,int j){
        System.out.println(one[i]+" "+two[j]);
        int[] temp=one;
        one=two;
        two=temp;
        System.out.println(one[i]+" "+two[j]);
    }
    public static void swap(int[] arr,int i,int j){
        System.out.println(arr[i]+" "+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println(arr[i]+" "+arr[j]);
    }
}