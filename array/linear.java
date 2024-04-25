import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        boolean flag=false;
        int n;
        System.out.print("Enter the number to be searched : ");
        n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
           if(arr[i]==n){
               System.out.println("Element found at index "+i);
               flag=true;
               break;
           }
        }
        if(flag==false){
            System.out.println("Element not found");
        }
        sc.close();
    }
}