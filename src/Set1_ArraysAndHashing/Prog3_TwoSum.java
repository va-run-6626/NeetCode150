package Set1_ArraysAndHashing;

import java.util.*;

public class Prog3_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size :");
        int n = sc.nextInt();
        System.out.println("Array : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target sum : ");
        int target = sc.nextInt();
        System.out.println("Two sum at : " + Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {i,map.get(diff)};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
