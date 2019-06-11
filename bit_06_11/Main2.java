package bit_06_11;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-11
 * Time:19:45
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(getB2(sc.nextLine()));
        }
    }

    public static String getB2(String s){
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(chars[i] == 'A'){
                chars[i] = 'V';
            }else if(chars[i] == 'B'){
                chars[i] = 'W';
            }else if(chars[i] == 'C'){
                chars[i] = 'X';
            }else if(chars[i] == 'D'){
                chars[i] = 'Y';
            }else if(chars[i] == 'E'){
                chars[i] = 'Z';
            }else if(chars[i] == ' '){
                continue;
            }else{
                chars[i] -= 5;
            }
        }
        return new String(chars);
    }
}
