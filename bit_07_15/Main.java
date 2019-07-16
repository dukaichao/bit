package bit_07_15;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 *
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的
 * 真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 *
 * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 *
 * 测试样例：
 * "Mr John Smith”,13
 * 返回："Mr%20John%20Smith"
 * ”Hello  World”,12
 * 返回：”Hello%20%20World”
 * User:Mr.Du
 * Date:2019/7/16
 * Time:18:53
 */
public class Main {
    public static void main(String[] args) {
        String s = "owv SOv           ";
        System.out.println(replaceSpace(s,s.length()));
    }
    public static String replaceSpace(String s, int len) {
        // write code here
        StringBuffer sb = new StringBuffer();
        String[] str = s.split(" ");
        System.out.println(str.length);
        if(str.length == 0){
            for(int i = 0;i<len;i++){
                sb.append("%20");
            }
            return sb.toString();
        }
        for(String ss : str){
            if(ss.equals("")){
                sb.append("%20");
            }else{
                sb.append(ss+"%20");
            }
        }
        if(s.lastIndexOf(" ") != len-1){
            return sb.substring(0,sb.length()-3).toString();
        }else{
            for(int i = s.length()-2;i>0;i--){
                if(s.charAt(i) == ' ') sb.append("%20");
                else break;
            }
            return sb.toString();
        }
    }
}
