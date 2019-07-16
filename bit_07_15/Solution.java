package bit_07_15;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:网
 *
 * 有一棵无穷大的满二叉树，其结点按根结点一层一层地从左往右依次编号，根结点编号为1。现在有两个结点a，b。
 * 请设计一个算法，求出a和b点的最近公共祖先的编号。
 *
 * 给定两个int a,b。为给定结点的编号。请返回a和b的最近公共祖先的编号。注意这里结点本身也可认为是其祖先。
 *
 * 测试样例：
 * 2，3
 * 返回：1
 * User:Mr.Du
 * Date:2019/7/16
 * Time:19:40
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(getLCA(2,3));
    }
    public static int getLCA(int a, int b) {

        // write code here
        if(a>b){
            return getLCA(a>>1,b);
        }else if(a<b){
            return getLCA(a,b>>1);
        }else{
            return a;
        }
    }
}
