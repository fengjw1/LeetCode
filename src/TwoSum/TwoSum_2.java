package TwoSum;

import java.util.HashMap;

/**
 * Created by fengjw on 2018/5/25
 * Code Change The World!
 */

public class TwoSum_2 {

    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }else {
                temp[0] = map.get(target - nums[i]);
                temp[1] = i;
                break;
            }
        }
        return temp;
    }
}
