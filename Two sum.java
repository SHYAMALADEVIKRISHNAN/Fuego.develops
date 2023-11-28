/*https://leetcode.com/problems/two-sum/description/
Title: "Optimizing Two-Sum: From Brute Force to HashMap Magic"

Introduction:
In the realm of algorithmic problem-solving, the journey from a brute-force approach to an optimized solution is often a fascinating one. 
Let's explore the transformation of a classic problem, the two-sum challenge, from a straightforward, nested loop solution to an elegant and efficient implementation using a HashMap.

The Problem: Finding Pairs that Sum to a Target
The two-sum problem involves identifying a pair of numbers in an array that adds up to a given target sum. Initially, the brute-force approach tackles this by checking every possible pair of numbers through nested loops, resulting in a time complexity of O(N^2). While functional, this approach becomes impractical for larger datasets.
*/
//Brute Force Approach:
// Brute Force Code
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
// Time complexity: O(N^2);
// Space Complexity: O(1);


/*The Optimization: HashMap to the Rescue
Recognizing the inefficiency of the brute-force method, we pivot to a more sophisticated solution using a HashMap. 
This optimized approach dramatically improves the time complexity to O(N) and the space complexity to O(N).
*/
//Optimized Code:
// Optimized Code
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
// Time complexity: O(N);
// Space Complexity: O(N);


/*How the Optimized Solution Works
Dry Run:
Let's illustrate the optimized solution with a dry run. Consider the array nums = [2, 7, 11, 15] and a target of 9. The HashMap numToIndex is used to store the complement of each element as we iterate through the array.

For the first element, nums[0] = 2, we add the key-value pair (2, 0) to the map.
For the second element, nums[1] = 7, we find that the complement target - nums[1] = 2 exists in the map, leading to the return of indices {0, 1}.
This optimized approach cleverly leverages the HashMap to achieve a linear time complexity, showcasing the elegance of algorithmic optimization.

Conclusion
The journey from a brute-force solution to an optimized algorithm is not just about efficiency—it's about unlocking the potential for scalability and performance. 
The two-sum problem serves as a compelling example of how a strategic shift in approach, in this case, adopting a HashMap, can lead to significant improvements. 
As we delve into the realm of algorithmic problem-solving, let's continue to explore and appreciate the art of optimization.*/
