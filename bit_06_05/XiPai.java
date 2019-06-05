package bit_06_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-05
 * Time:21:13
 */
public class XiPai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[2*n];
            for(int i = 0;i<2*n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int[] arr1 = new int[2*n];
            while(k>0){
                int index = 0;
                for(int i = n-1,j = 2*n-1;j>=n&&i>=0;j--,i--){
                    arr1[index++] = arr[j];
                    arr1[index] = arr[i];
                    index++;
                }
                System.arraycopy(arr1,0,arr,0,2*n);
                int i = 0;
                int j = 2*n-1;
                while(i<=j){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                    i++;
                    j--;
                }
                System.out.println(Arrays.toString(arr));

                k--;
            }

            for(int m = 0;m<2*n;m++){
                if(m == 2*n-1){
                    System.out.println(arr[m]);
                }else{
                    System.out.print(arr[m]+" ");
                }
            }
            t--;

        }
    }
}
