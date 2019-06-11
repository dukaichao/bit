package bit_06_11;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-11
 * Time:19:34
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println(getTotalCount(sc.nextInt()));
        }
    }

    public static int getTotalCount(int m){
        int a = 1;
        int b = 1;
        int count = a;
        while(m>2){
            count = a + b;
            a = b;
            b = count;
            m--;
        }
        return count;
    }
}
