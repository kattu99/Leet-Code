/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        
        for (int i=0; i<nums.length; i++) {
            int value = nums[i];
            if (hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            }
            else {
                hashSet.add(nums[i]);
            }
        }
        
        return (int) hashSet.iterator().next();
         
    }
}