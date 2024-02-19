import java.util.Scanner;

public class sortingarrsquare {
    static void reverse(int[] arr,int i,int j) {

        int temp = 0;
        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
    }

    static void printarr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] sortedsquare(int[] arr) {
        int n = arr.length, i = 0, j = n - 1, k = 0;
        int[] ans = new int[n];
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] * arr[i];
                i++;

            } else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }


        public static void main (String[]args){
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
            int[] ans=sortedsquare(arr);

            System.out.println("Sorted arr");
            reverse(ans,0,n-1);
            printarr(ans);
        }

}
