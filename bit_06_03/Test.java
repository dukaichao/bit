package bit_06_03;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:一个数m的立方等于m个奇数之和，请你输出一个数m的用字符串表示的加法
 * 例如:
 * 1^3 = 1
 * 2^3 = 3 + 5
 * 3^3 = 7 + 9 + 11
 * 4^3 = 13 + 15 + 17 + 19
 * ...
 * User:Mr.Du
 * Date:2019-06-03
 * Time:19:30
 */
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNextInt()){
            System.out.println(GetSequeOddNum(sc.nextInt()));
        //}
    }

    public static String GetSequeOddNum(int m){
        int n = m;
        int a = 1;
        int t = 2;
        while(n>1){
            a += t;
            t += 2;
            n--;
        }
        String str = ""+a;
        for(int i = 1;i<m;i++){
            a+=2;
            str += "+"+ a;
        }
        return str;
    }
}
