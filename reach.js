function maxSubarray(nums){
    let currSum=nums[0];
    let maxSum=nums[0];

    for(let i=1;i<nums.length;i++){
        currSum=Math.max(currSum+nums[i],nums[i]);
        maxSum=Math.max(currSum,maxSum);
    }
    return maxSum;
}
console.log(maxSubarray([-2,1,-3,4,-1,2,1,-5,4]));


function sum(a,b){
    return a+b;
}
console.log(sum(2,5));