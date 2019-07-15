package bit_07_14;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。为了让问题简单,假设这是
 * 一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位置;1代表小青蛙可以达到的位
 * 置。小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并且保证一定有起点到终点可达的路径),
 * 小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,向上爬一个单位距离需要消耗3个单位的体力值,向下移动不消耗
 * 体力值,当小青蛙的体力值等于0的时候还没有到达出口,小青蛙将无法逃离迷宫。现在需要你帮助小青蛙计算出能否用仅剩的
 * 体力值跳出迷宫(即达到(0,m-1)位置)。
 *
 * 输入描述:
 * 输入包括n+1行:
 * 第一行为三个整数n,m(3 <= m,n <= 10),P(1 <= P <= 100)
 * 接下来的n行:
 * 每行m个0或者1,以空格分隔
 *
 *
 * 输出描述:
 * 如果能逃离迷宫,则输出一行体力消耗最小的路径,输出格式见样例所示;如果不能逃离迷宫,则输出"Can not escape!"。 测试数据保证答案唯一
 * 示例1
 * 输入
 * 4 4 10 1 0 0 1 1 1 0 1 0 1 1 1 0 0 1 1
 * 输出
 * [0,0],[1,0],[1,1],[2,1],[2,2],[2,3],[1,3],[0,3]
 *
 * User:Mr.Du
 * Date:2019/7/15
 * Time:16:09
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            // n*m迷宫,小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)
            // 小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,向
            // 上爬一个单位距离需要消耗3个单位的体力值,向下移动不消耗体力值
            int n = in.nextInt();
            int m = in.nextInt();
            // 剩余体力值
            int power = in.nextInt();
            int[][] maze = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++)
                    maze[i][j] = in.nextInt();
            }
            System.out.println(pathOut(n , m, maze, power));
        }
    }

    static String path = "";
    public static String pathOut(int n, int m, int[][] maze, int power){
        if(n <= 0)
            return "Can not escape!";

        boolean[][] visited = new boolean[n][m];
        findPath(n, m, maze, 0, 0, "", visited, power);

        return path;
    }

    public static void findPath(int n, int m, int[][] maze, int nowx, int nowy, String res, boolean[][] visited, int power){
        if(nowx == 0 && nowy == m - 1 && maze[0][m - 1] == 1){
            if(power >= 0)
                path = res + "[0," + (m - 1) + "]";
            else
                path = "Can not escape!";

            return;
        }

        if(nowx < n && nowy < m && nowx >= 0 && nowy >= 0 && maze[nowx][nowy] == 1 && !visited[nowx][nowy]){

            visited[nowx][nowy] = true;
            res += "[" + nowx + "," + nowy + "],";
            // 水平向右
            findPath(n, m, maze, nowx, nowy + 1, res, visited, power - 1);
            // 向下
            findPath(n, m, maze, nowx + 1, nowy, res, visited, power);
            // 水平向左
            findPath(n, m, maze, nowx, nowy - 1, res, visited, power - 1);
            // 向上
            findPath(n, m, maze, nowx - 1, nowy, res, visited, power - 3);
        }

    }
}
