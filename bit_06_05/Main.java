package bit_06_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-05
 * Time:21:13
 */
public class Main {
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n<=0||n>1000) break;
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                list.add(sc.nextInt());
            }
            int m = sc.nextInt();
            int count = 0;
            for(int i : list){
                if(i == m){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
