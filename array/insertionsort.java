public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 42, 38, 64, 12, 24, 5, 1};
        int n = arr.length;
        for (int arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
        System.out.println("\nSorted array is:");
        for (int arr1 : arr) {
            System.out.print(arr1 + " ");
        }
    }
}