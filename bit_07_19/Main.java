package bit_07_19;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 1、对输入的字符串进行加解密，并输出。
 *
 * 2加密方法为：
 *
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 *
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 *
 * 其他字符不做变化。
 *
 * 3、解密方法为加密的逆过程。
 *
 *
 *
 * 接口描述：
 *
 *     实现接口，每个接口实现1个基本操作：
 *
 * void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
 *
 * 说明：
 *
 * 1、字符串以\0结尾。
 *
 * 2、字符串最长100个字符。
 * User:Mr.Du
 * Date:2019/7/20
 * Time:20:22
 */
public class Main {
    public static void main(String[] args) {
        String s = "ylV2Zv83sVqf1LF0P6soqMYF1aAv0i61iy0oScauz4Wv6HGo30C9v1xFus8e9JZ0VG6JF1680h2Zk3OV26ZYjg5YQHT09ig";
        String s1 = "XKu1yU72RuPE0ke9o5RNPlxe0ZaU9H50HX9NrBZTY3vU5gfN29b8U0WeTR7D8iy9uf5ie0579G1yJ2nu15yxIF4xpgs98HF";
        String s2 = "XKu1yU72RuPE0ke9o5RNPlxe0ZzU9H50HX9NrBZTY3vU5gfN29b8U0WeTR7D8iy9uf5ie0579G1yJ2nu15yxIF4xpgs98HF";
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                System.out.println(i);
                break;
            }
        }
        System.out.println(s.substring(26));
        System.out.println(s1.substring(26));
        System.out.println(s1.equals(s2));
    }
}
