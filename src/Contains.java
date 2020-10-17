import java.util.Arrays;

public class Contains {
    public static int notContains(int[] nums) {
        Arrays.sort(nums);
        boolean isThereNumberOne = false;
        for(int i = 0; i < nums.length - 1; i++)
            if(nums[i] > 0)
            {
                if(nums[i] == 1) isThereNumberOne = true;
                if(!isThereNumberOne) return 1;
                if(nums[i] != nums[i+1] - 1) return nums[i] + 1;
            }
        return nums[nums.length - 1] + 1;
    }
}