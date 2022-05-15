package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
      //  int []nums={0,0,1,1,1,2,2,3,3,4};
        int []nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    //nums = [0,0,1,1,1,2,2,3,3,4]=10-5
    public static int removeDuplicates(int[] nums) {
        int k=0;
            for(int i=0;i< nums.length-1;i++)
            {
                if(nums[i]==nums[i+1])
                {
                    k++;
                }
                else
                {
                    nums[k]=nums[i+1];
                }
            }
            return nums.length-k;
    }
}
