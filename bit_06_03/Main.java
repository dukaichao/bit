package bit_06_03;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:输入十个数，分别表示数字1-9的个数，输出由这些数组成的最小数
 * User:Mr.Du
 * Date:2019-06-03
 * Time:19:45
 */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        while(sc.hasNextInt()){
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i<10;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 1;i<10;i++){
                if(arr[i]!=0){
                    int tmp = arr[i];
                    while(tmp>0){
                        tmp--;
                        sb.append(i);
                    }
                }
            }
            int t = arr[0];
            while(t>0){
                sb.insert(1,"0");
                t--;
            }
            System.out.println(sb);
        }
    }
}
