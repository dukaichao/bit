package bit_06_14;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
 *
 * 输入描述:
 * 输入包括多组测试数据。
 * 每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
 * 学生ID编号从1编到N。
 * 第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
 * 接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 * 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 * 示例1
 * 输入
 * 5 7
 * 1 2 3 4 5
 * Q 1 5
 * U 3 6
 * Q 3 4
 * Q 4 5
 * U 4 5
 * U 2 9
 * Q 1 5
 * 输出
 * 5
 * 6
 * 5
 * 9
 * User:Mr.Du
 * Date:2019-06-14
 * Time:23:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[m];
            for(int i = 0;i<m;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                char c = sc.next().charAt(0);
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(c == 'Q'){
                    int tmp = a;
                    a = a > b ? b : a;
                    b = a == tmp ? b : tmp;
                    System.out.println(getMax(arr,a-1,b-1));
                }else{
                    arr[a-1] = b;
                }
            }
        }
    }

    public static int getMax(int[] arr, int i, int j) {
        int max = arr[i];
        while(i+1<=j){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
}
