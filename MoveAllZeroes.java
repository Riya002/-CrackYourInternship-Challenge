package Arrays;

public class MoveAllZeroes {
    public static void main(String[] args) {
        int[]nums={0,1,0,3,12};
        moveZeroes(nums);
    }
    //nums = [0,1,0,3,12]
//    nums[0]=nums[1] //zero1
//    //zero2
//    nums[1]=nums[3]
//    nums[2]=nums[4]
    public static void moveZeroes(int[] nums) {
        int zero=0;
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else
            {
                nums[idx++]=nums[i];
            }
        }
        for(int i=0;i<zero;i++)
        {
            nums[idx++]=0;
        }
//       for(int i=0;i<nums.length;i++)
//       {
//           System.out.println(nums[i]+" ");
//       }
    }
}
