package Set1_ArraysAndHashing;
import java.util.*;

public class Prog2_ValidArnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Valid Arnagram : " + validArnagram(s1,s2));
    }
    public static boolean validArnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
        }
        return map.isEmpty();
    }
}
