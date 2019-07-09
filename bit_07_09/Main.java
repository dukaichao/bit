package bit_07_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/8
 * Time:20:58
 */
public class Main {

    private static final int[] W = {17*29,29,1};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] p = in.next().split("\\.");
        String[] a = in.next().split("\\.");
        int[] P = {Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2])};
        int[] A = {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
        int ta = A[0]*W[0]+A[1]*W[1]+A[2]*W[2];
        int tp = P[0]*W[0]+P[1]*W[1]+P[2]*W[2];
        int t = ta-tp;
        if(ta<tp){
            System.out.print("-");
            t = -t;
        }
        System.out.println(t/W[0]+"."+t%W[0]/W[1]+"."+t%W[0]%W[1]/W[2]);
        String[] str = {"1"};
        main1(str);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String m = sc.next();
            String n = sc.next();
            String[] s1 = m.split("\\.");
            String[] s3 = s1.clone();
            String[] s2 = n.split("\\.");
            int count = 0;
            while(Integer.parseInt(s2[2])<Integer.parseInt(s1[2])){
                s2[2] = Integer.parseInt(s2[2])+29 + "";
                count++;
            }
            s2[2] = Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]) + "";
            s1[1] = Integer.parseInt(s1[1]) + count + "";
            count = 0;
            while(Integer.parseInt(s2[1])<Integer.parseInt(s1[1])){
                s2[1] = Integer.parseInt(s2[1]) + 17 + "";
                count++;
            }
            s2[1] = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]) + "";
            s1[0] = Integer.parseInt(s1[0]) + count + "";
            int t = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
            System.out.println(Arrays.toString(s3));
            System.out.println(t+"."+s2[1]+"."+s2[2]);
        }
    }

    public static void get(String m,String n){

    }
}