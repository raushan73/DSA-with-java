import java.util.Scanner;

public class sorting {
    static void printarr(int[] arr){
        int n=arr.length;
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

    }

    static void sorting(int[] arr){
        int n = arr.length;
        int zero = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;

            }
        }
        for(int i =0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a ar sizze");
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Ent"+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Original arr");
        printarr(arr);
        sorting(arr);
        System.out.println("Sorted arr");
        printarr(arr);




    }
}
