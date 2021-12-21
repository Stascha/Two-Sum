import java.util.*;
import java.util.HashMap;

public class Solution 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] r = new int[2];
        for(int i = 0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                r[0] = map.get(complement);
                r[1] = i;
                
                return r;
      
            }
               
            map.put(nums[i], i);
        }
         
        return r;
    }



    public static void main(String []args)
    {
        int[] nums = new int[]{1 , 5, 80 , 4, 11, 9 , 7, 6 };
       
        int [] r = new int[2];
     
        r =  twoSum( nums, 89) ;
     
     
        System.out.println( r[0] + " " + r[1] );
     }
}
