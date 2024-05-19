package Problems.Sorting.Cyclicsort;

class FindDuplicateNumber_Leetcode287 {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println("Duplicate element: " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int pointer = 0;
        while(pointer < nums.length){
            int correct_index = nums[pointer] - 1;
            if(pointer != correct_index){
                if(nums[correct_index] == nums[pointer]){
                    return nums[pointer];
                }
                swap(pointer, correct_index, nums);
            }else{
                pointer++;
            }
        }
        return -1;
    }

    public static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}