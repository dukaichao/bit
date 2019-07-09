package bit_07_10;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，计算小孩有多少种上楼的方式。
 * 为了防止溢出，请将结果Mod 1000000007
 *
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 *
 * 测试样例1：
 * 1
 * 返回：1
 * 测试样例2：
 * 3
 * 返回：4
 * 测试样例3：
 * 4
 * 返回：7
 * User:Mr.Du
 * Date:2019/7/10
 * Time:3:31
 */
public class Main {

    public int countWays(int n) {
        // write code here
        if(n<=2) return n;
        if(n == 3) return 4;
        int a = 1;
        int b = 2;
        int c = 4;
        int res = 0;
        while(n>3){
            res = ((a + b)%1000000007 + c)%1000000007;
            a = b;
            b = c;
            c = res;
            n--;
        }
        return res;
    }
}
