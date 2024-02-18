import java.util.Scanner;

public class rotation {
    static void reverse(int[] arr,int i,int j){
        int temp = 0;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


        }
    }
    static  void rotateinplace(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6};
        System.out.println("Original array ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("enter k: ");
        int k=sc.nextInt();
        rotateinplace(arr,k);
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }


    }
}
