class Solution 
{
    public int[] twoSum(int[] nums, int target) 
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

}
