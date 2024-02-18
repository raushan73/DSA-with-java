import java.util.Scanner;

public class sortingeven {
    static void printarr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sorting(int[] arr){
        int n = arr.length;
        int left =0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];

                arr[right]=temp;
                left++;
                right--;

            }
            if(arr[left] %2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ar sizze");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Ent" + n + "element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original arr");
        printarr(arr);
        sorting(arr);
        System.out.println("Sorted arr");
        printarr(arr);
    }
}


