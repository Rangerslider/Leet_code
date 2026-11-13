/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const a = new Map();
for (i=0; i< nums.length; i++){
    const sum = target - nums[i];
    if (a.has(sum)){
        return[a.get(sum),i];
    }
    a.set(nums[i], i);
}
return[];
    
};