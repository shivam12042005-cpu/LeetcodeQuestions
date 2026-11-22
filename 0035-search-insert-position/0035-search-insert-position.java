class Solution {
    public int searchInsert(int[] nums, int key) {
        int n = nums.length;

        int i = 0;
        int j = nums.length-1;

        while(i <= j){
            int mid = i + (j - i)/2;

            if(nums[mid] == key){
                return mid;
            }
            else if(nums[mid] < key){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return i;
    }
}