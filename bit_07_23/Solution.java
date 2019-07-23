package bit_07_23;
import  java.util.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:查找兄弟单词
 * User:Mr.Du
 * Date:2019/7/23
 * Time:21:47
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            List<String> list = new ArrayList<>();
            List<String> list1 = new ArrayList<>();
            int n = Integer.parseInt(sc.next());
            for(int i = 0;i<n;i++){
                list.add(sc.next());
            }
            String s = sc.next();
            int m = Integer.parseInt(sc.next());
            int count = 0;
            int[] arr1 = new int[26];
            for(int i = 0;i<s.length();i++){
                arr1[s.charAt(i) - 97]++;
            }
            for(String ss : list){
                int[] arr2 = new int[26];
                for(int i = 0;i<ss.length();i++){
                    arr2[ss.charAt(i) - 97]++;
                }
                int j = 0;
                for(;j<26;j++){
                    if(arr1[j]!=arr2[j]) break;
                }
                if(j == 26 && !ss.equals(s)) { count++; list1.add(ss); }
            }
            Collections.sort(list1);
            if(m<=count){
                System.out.println(count +"\n"+list1.get(m-1));
            }else{
                System.out.println(count);
            }
        }
    }
}
