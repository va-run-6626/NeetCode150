package Set1_ArraysAndHashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prog1_ContainsDublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size : ");
        int n = sc.nextInt();
        System.out.println("Array : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Contains Dublicate : " + containsDublicate(arr));
    }
    public static boolean containsDublicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
