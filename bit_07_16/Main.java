import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = isP(s);
        if(b){ System.out.println("YES"); return ; }
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                String s1 = "";
                if(i == 0) s1 = s.charAt(j) + s.substring(i);
                else s1 = s.substring(0,i)+s.charAt(j)+s.substring(i);
                s = s.substring(0,j+1) + s.charAt(i) + s.substring(j+1);
                if(isP(s)||isP(s1)){
                    System.out.println("YES"); return ;
                }else{
                    System.out.println("NO"); return ;
                }
            }
        }
    }
    //   cbascsbc
    public static boolean isP(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}