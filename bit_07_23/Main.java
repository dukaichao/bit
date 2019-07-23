package bit_07_23;
import java.util.Scanner;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/23
 * Time:20:46
 */
// write your code here
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = sc.next();
            String b = sc.next();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for(int i = 0;i<a.length();i++){
                arr1[a.charAt(i) - 65]++;
            }
            for(int i = 0;i<b.length();i++){
                arr2[b.charAt(i) - 65]++;
            }
            int mm = -1;
            for(int i = 0;i<26;i++){
                if(arr1[i]<arr2[i]){
                    System.out.println("No");
                    mm = i;
                    break;
                }
            }
            if(mm == -1)
                System.out.println("Yes");
        }
    }
}
