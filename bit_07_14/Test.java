package bit_07_14;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:\
 *
 * User:Mr.Du
 * Date:2019/7/15
 * Time:16:16
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("lled"));
    }
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        //定义数组长度为26，表示26个字母   0-25  分别表示a-z的位置
        int[] arr = new int[26];
        int count = 1;
        //遍历字符数组，任何一个字母出现一次，都在arr数组对应位置加1
        for(int i = 0;i<len;i++) {
            arr[chars[i] - 'a'] += count;
        }
        for(int i = 0;i<len;i++) {
            if(arr[chars[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
