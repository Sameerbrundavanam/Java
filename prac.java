import java.util.ArrayList;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int target = read.nextInt();
        int n = read.nextInt();
        ArrayList<Integer> arl = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int num = read.nextInt();
            arl.add(num);
        }
        // int left = 0, right = 0, maxLen  = 0;
        // int ps = 0;
        // while(right < n){
        //     ps += arl.get(right);
        //     while(ps > k && left <= right){
        //         ps -= arl.get(left);
        //         left++;
        //     }

        //     if(ps <= k){
        //         maxLen = Math.max(maxLen, right - left + 1);
        //     }
        //     right++;
        // }
        // System.out.println(maxLen);
        int l = 0, r = n - 1;
        while(l <= r){
           if(arl.get(l) + arl.get(r) == target){
                System.out.println(l + " " +r);
                return;
           } else if(arl.get(l) + arl.get(r) < target){
                l++;
           } else{
                r--;
           }

        }
        read.close();
    }
}
