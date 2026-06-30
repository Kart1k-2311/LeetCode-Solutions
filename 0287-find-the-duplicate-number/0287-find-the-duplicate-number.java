class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    void swap(int[] nums, int first,int last){
        int temp = nums[first];
        nums[first]=nums[last];
        nums[last] = temp;
    }    
    
}