package array

class BuildArrayFromPermutation {
    class Solution {
        fun buildArray(nums: IntArray): IntArray {
            var ans = intArrayOf()
            for (num in nums) {
                ans += nums[num]
            }
            return ans

            /*
            別解
            return IntArray(nums.size) { nums[nums[it]] }
             */
        }
    }
}