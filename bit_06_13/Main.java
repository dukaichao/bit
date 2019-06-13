package bit_06_13;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-13
 * Time:19:29
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int a = 0;
            int b = 0;
            int c = 0;
            int count = 0;
            int count_c = 0;
            int count_d = 0;
            double sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i : arr){
                if(i%10==0) a += i;
                else if(i%5 == 1) b += i*(int)Math.pow(-1,count++);
                else if(i%5 == 2) count_c++;
                else if(i%5 == 3) { count_d++; sum+=i; }
                else if(i%5 == 4&&i>max) { max = i;}
            }

            System.out.print(a+" "+b+" "+count_c+" ");
            System.out.printf("%.1f", (sum/count_d));
            //System.out.printf("%.1f",(count_d/sum));
            System.out.println(" "+max);
        }
    }
}
