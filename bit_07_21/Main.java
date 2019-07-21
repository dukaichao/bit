package bit_07_21;
import java.util.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
 *
 * 输入描述:
 * 每个测试输入包含2个整数,n和m
 *
 *
 * 输出描述:
 * 按每个组合的字典序排列输出,每行输出一种组合
 * 示例1
 * 输入
 * 5 5
 * 输出
 * 1 4
 * 2 3
 * 5
 * User:Mr.Du
 * Date:2019/7/21
 * Time:19:50
 */

public class Main{
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> l = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            dd(1, m, n);
            for(ArrayList<Integer> ll : list) {
                int i = 0;
                for(; i < ll.size() - 1; i++) {
                    System.out.print(ll.get(i) + " ");
                }
                System.out.println(ll.get(i));
            }
        }
    }

    public static void dd(int index, int count, int n) {
        System.out.println("count = "+count);
        if(count == 0) {
            list.add(new ArrayList<>(l));
        }
        else {
            for(int i = index; i <= count && i <= n; i++) {
                l.add(i);
                dd(i + 1, count - i, n);
                l.remove(l.size() - 1);

            }
        }
    }
}
