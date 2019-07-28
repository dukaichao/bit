package bit_07_28;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:我们从一块字母板上的位置 (0, 0) 出发，该坐标对应的字符为 board[0][0]。
 *
 * 在本题里，字母板为board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"].
 *
 * 我们可以按下面的指令规则行动：
 *
 * 如果方格存在，'U' 意味着将我们的位置上移一行；
 * 如果方格存在，'D' 意味着将我们的位置下移一行；
 * 如果方格存在，'L' 意味着将我们的位置左移一列；
 * 如果方格存在，'R' 意味着将我们的位置右移一列；
 * '!' 会把在我们当前位置 (r, c) 的字符 board[r][c] 添加到答案中。
 * 返回指令序列，用最小的行动次数让答案和目标 target 相同。你可以返回任何达成目标的路径。
 *
 *
 *
 * 示例 1：
 *
 * 输入：target = "leet"
 * 输出："DDR!UURRR!!DDD!"
 * 示例 2：
 *
 * 输入：target = "code"
 * 输出："RR!DDRR!UUL!R!"
 *
 *
 * 提示：
 *
 * 1 <= target.length <= 100
 * target 仅含有小写英文字母。
 *
 *
 * User:Mr.Du
 * Date:2019/7/28
 * Time:11:26
 */
public class alphabetBoardPath {

    public static void main(String[] args) {
        System.out.println(alphabetBoardPath("zdz"));
        System.out.println("DDR!UURRR!!DDD!");
    }
    public static String alphabetBoardPath(String s) {
        String[] str = {"abcde","fghij","klmno","pqrst","uvwxy","z****"};
        StringBuffer sb = new StringBuffer();
        int[][] arr = new int[27][2];
        for(int i = 0;i<6;i++){
            for(int j = 0;j<5;j++){
                if (str[i].charAt(j)>='a'&&str[i].charAt(j)<='z'){
                    arr[str[i].charAt(j)-'a'][0] = i;
                    arr[str[i].charAt(j)-'a'][1] = j;
                }
            }
        }
        int nx = 0;
        int ny = 0;
        for(int i = 0;i<s.length();i++){
            int t = s.charAt(i) - 'a';
            if(nx == 5 && ny == 0){
                while(nx>arr[t][0]) { sb.append("U");nx--; }
                while(nx<arr[t][0]) { sb.append("D");nx++; }
                while(ny>arr[t][1]) { sb.append("L");ny--; }
                while(ny<arr[t][1]) { sb.append("R");ny++; }
            }else{
                while(ny>arr[t][1]) { sb.append("L");ny--; }
                while(ny<arr[t][1]) { sb.append("R");ny++; }
                while(nx>arr[t][0]) { sb.append("U");nx--; }
                while(nx<arr[t][0]) { sb.append("D");nx++; }
            }
            sb.append("!");
        }

        return sb.toString();
    }
}
